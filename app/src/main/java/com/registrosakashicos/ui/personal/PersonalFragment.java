package com.registrosakashicos.ui.personal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.registrosakashicos.R;

public class PersonalFragment extends Fragment implements View.OnClickListener{
    private PersonalViewModel personalViewModel;
    private android.widget.Button Button;

     public View onCreateView(@NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        personalViewModel = ViewModelProviders.of(this).get(PersonalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_personal, container, false);
        Button = (android.widget.Button) root.findViewById(R.id.button2);
        Button.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        EditText nombre = (EditText) getView().findViewById(R.id.nombre);
        EditText direccion = (EditText) getView().findViewById(R.id.direccion);
        EditText lugarNacimiento = (EditText) getView().findViewById(R.id.lugarNacimiento);
        EditText fechaNacimiento = (EditText) getView().findViewById(R.id.fechaNacimiento);
        EditText telefono = (EditText) getView().findViewById(R.id.telefono);
        EditText mail = (EditText) getView().findViewById(R.id.email);

        personalViewModel.setNombre(nombre.getText().toString());
        personalViewModel.setDireccion(direccion.getText().toString());
        personalViewModel.setLugarNacimiento(lugarNacimiento.getText().toString());
        personalViewModel.setFechaNacimiento(fechaNacimiento.getText().toString());
        personalViewModel.setTelefono(telefono.getText().toString());
        personalViewModel.setMail(mail.getText().toString());


        Toast.makeText(getActivity(),"Datos guardados",
                Toast.LENGTH_LONG).show();
    }


}
