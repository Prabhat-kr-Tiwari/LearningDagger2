package com.example.componentbuilderbindsinstancenamed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.componentbuilderbindsinstancenamed.car.Car;
import com.example.componentbuilderbindsinstancenamed.dagger.CarComponent;
import com.example.componentbuilderbindsinstancenamed.dagger.DaggerCarComponent;
import com.example.componentbuilderbindsinstancenamed.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component= DaggerCarComponent
                .builder()
                .horsePower(900)
                .engineCapacity(190)
                .build();
        component.inject(this);
        car.drive();
    }
}