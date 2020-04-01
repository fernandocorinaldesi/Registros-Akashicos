package com.registrosakashicos.ui.orientaciondelalma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrientacionDelAlmaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrientacionDelAlmaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}