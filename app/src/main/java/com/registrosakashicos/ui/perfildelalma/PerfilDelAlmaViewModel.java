package com.registrosakashicos.ui.perfildelalma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilDelAlmaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PerfilDelAlmaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}