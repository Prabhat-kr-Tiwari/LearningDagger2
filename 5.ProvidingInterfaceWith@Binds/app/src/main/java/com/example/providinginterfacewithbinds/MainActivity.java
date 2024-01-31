package com.example.providinginterfacewithbinds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.providinginterfacewithbinds.car.Car;
import com.example.providinginterfacewithbinds.dagger.CarComponent;
import com.example.providinginterfacewithbinds.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component= DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}