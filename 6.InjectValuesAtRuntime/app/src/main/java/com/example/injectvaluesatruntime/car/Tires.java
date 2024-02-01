package com.example.injectvaluesatruntime.car;

import android.util.Log;

//suppose we don't own this class so we can't annotate with @Inject
public class Tires {
    private static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "Tires inflated ");
    }
}
