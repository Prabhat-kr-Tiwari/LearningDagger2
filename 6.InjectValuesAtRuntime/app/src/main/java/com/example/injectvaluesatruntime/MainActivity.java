package com.example.injectvaluesatruntime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.injectvaluesatruntime.car.Car;
import com.example.injectvaluesatruntime.dagger.CarComponent;
import com.example.injectvaluesatruntime.dagger.DaggerCarComponent;
import com.example.injectvaluesatruntime.dagger.DieselEngineModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component= DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(899))
                        .build();
        component.inject(this);
        car.drive();



    }
}