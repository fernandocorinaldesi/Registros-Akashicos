package com.registrosakashicos;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Environment;
import android.view.View;

import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.registrosakashicos.ui.personal.PersonalViewModel;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_procesoevolutivo,
                R.id.nav_perfildelalma, R.id.nav_orientaciondelalma, R.id.nav_perfildelalma2,R.id.nav_personal)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
         fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonalViewModel model = ViewModelProviders.of(MainActivity.this).get(PersonalViewModel.class);
                //String dst= Environment.getExternalStorageState()+ "/form-filled.pdf";
                String dst="/storage/emulated/0"+"/ferform.pdf";
                try {
                    manipulatePDF(model,dst);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                Toast.makeText(MainActivity.this,"Archivo grabado en "+dst,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
    private void manipulatePDF(PersonalViewModel model,String dst) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(getResources().openRawResource(R.raw.form));
        PdfStamper stamper = new PdfStamper(reader,
                new FileOutputStream(dst));
        AcroFields form = stamper.getAcroFields();

        form.setField("nombre",model.getNombre());
        form.setField("lugarnacimiento",model.getLugarNacimiento());
        form.setField("direccion",model.getDireccion());
        form.setField("fechanacimiento",model.getFechaNacimiento());

        stamper.setFormFlattening(true);
        stamper.close();
        reader.close();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
