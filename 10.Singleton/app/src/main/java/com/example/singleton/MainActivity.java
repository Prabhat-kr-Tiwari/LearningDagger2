package com.example.singleton;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.singleton.car.Car;
import com.example.singleton.dagger.CarComponent;
import com.example.singleton.dagger.DaggerCarComponent;

import javax.inject.Inject;
public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1;
    @Inject
    Car car2;
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
        car1.drive();
        car2.drive();
    }
}