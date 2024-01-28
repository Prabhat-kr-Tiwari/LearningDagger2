package com.example.dagger2;
import android.util.Log;
import javax.inject.Inject;
public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    //now dagger knows this is the way to instatiate car object
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void drive(){
        Log.d(TAG, "driving");
    }
}
