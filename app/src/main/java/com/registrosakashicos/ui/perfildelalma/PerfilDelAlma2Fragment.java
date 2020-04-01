package com.registrosakashicos.ui.perfildelalma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.registrosakashicos.R;

public class PerfilDelAlma2Fragment extends Fragment {

    private PerfilDelAlma2ViewModel perfilDelAlma2ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*perfilDelAlma2ViewModel =
                ViewModelProviders.of(this).get(PerfilDelAlma2ViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_perfildelalma2, container, false);
        /*final TextView textView = root.findViewById(R.id.text_send);
        perfilDelAlma2ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}