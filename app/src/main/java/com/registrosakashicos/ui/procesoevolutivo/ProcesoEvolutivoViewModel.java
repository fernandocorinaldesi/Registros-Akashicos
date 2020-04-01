package com.registrosakashicos.ui.procesoevolutivo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProcesoEvolutivoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProcesoEvolutivoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}