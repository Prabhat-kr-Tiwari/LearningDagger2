package com.example.injectvaluesatruntime.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private int horsePower;
    private static final String TAG = "Car";

    public DieselEngine(int horsePower){
        this.horsePower=horsePower;

    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started  Horse Power"+horsePower);

    }
  /* private static final String TAG = "Car";
    @Inject
    public DieselEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started");

    }*/
}
