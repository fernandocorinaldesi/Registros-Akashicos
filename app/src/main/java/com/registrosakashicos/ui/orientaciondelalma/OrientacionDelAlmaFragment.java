package com.registrosakashicos.ui.orientaciondelalma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.registrosakashicos.R;

public class OrientacionDelAlmaFragment extends Fragment {

    private OrientacionDelAlmaViewModel orientacionDelAlmaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*orientacionDelAlmaViewModel =
                ViewModelProviders.of(this).get(OrientacionDelAlmaViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_orientaciondelalma, container, false);
        /*final TextView textView = root.findViewById(R.id.text_share);
        orientacionDelAlmaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}