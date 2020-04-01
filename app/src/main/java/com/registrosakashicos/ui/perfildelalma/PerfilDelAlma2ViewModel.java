package com.registrosakashicos.ui.perfildelalma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilDelAlma2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PerfilDelAlma2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}