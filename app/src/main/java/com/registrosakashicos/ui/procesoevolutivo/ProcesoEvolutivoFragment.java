package com.registrosakashicos.ui.procesoevolutivo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.registrosakashicos.R;

public class ProcesoEvolutivoFragment extends Fragment {

    private ProcesoEvolutivoViewModel procesoEvolutivoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        procesoEvolutivoViewModel =
                ViewModelProviders.of(this).get(ProcesoEvolutivoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_procesoevolutivo, container, false);
        /*final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}