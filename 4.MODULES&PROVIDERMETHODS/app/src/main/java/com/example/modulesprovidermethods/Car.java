package com.example.modulesprovidermethods;
import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject Engine engine;
    private Wheels wheels;
    //now dagger knows this is the way to instatiate car object
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        Log.d(TAG, "driving");
    }
}
