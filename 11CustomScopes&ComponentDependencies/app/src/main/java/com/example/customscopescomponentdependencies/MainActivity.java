package com.example.customscopescomponentdependencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customscopescomponentdependencies.car.Car;
import com.example.customscopescomponentdependencies.dagger.ActivityComponent;
import com.example.customscopescomponentdependencies.dagger.DaggerActivityComponent;

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
     /*   CarComponent component= DaggerCarComponent
                .builder()
                .horsePower(900)
                .engineCapacity(190)
                .build();*/
        ActivityComponent component= DaggerActivityComponent.builder()
                .horsePower(890)
                .engineCapacity(758).appComponent(
                        ((ExampleApp)getApplication()).getAppComponent()
                ).build();
        component.inject(this);
        car1.drive();
        car2.drive();

    }
}