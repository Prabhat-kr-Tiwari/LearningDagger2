package com.example.customscopescomponentdependencies.car;
import android.util.Log;

import com.example.customscopescomponentdependencies.dagger.PerActivity;

import javax.inject.Inject;
@PerActivity
public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    //    @Inject Engine engine;
    private Wheels wheels;
    //now dagger knows this is the way to instatiate car object
    @Inject
    public Car(Driver driver, Wheels wheels, Engine engine) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
    public void drive() {
        engine.start();
        Log.d(TAG, driver +"  driving  "  +this);
    }
}
