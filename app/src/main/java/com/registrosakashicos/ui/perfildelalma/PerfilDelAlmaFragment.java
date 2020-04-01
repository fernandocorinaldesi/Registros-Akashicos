package com.registrosakashicos.ui.perfildelalma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.registrosakashicos.R;

public class PerfilDelAlmaFragment extends Fragment {

    private PerfilDelAlmaViewModel perfilDelAlmaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*perfilDelAlmaViewModel =
                ViewModelProviders.of(this).get(PerfilDelAlmaViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_perfildelalma, container, false);
        /*final TextView textView = root.findViewById(R.id.text_tools);
        perfilDelAlmaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}