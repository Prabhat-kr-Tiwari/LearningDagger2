package com.example.injectvaluesatruntime.dagger;



import com.example.injectvaluesatruntime.MainActivity;
import com.example.injectvaluesatruntime.car.Car;

import dagger.Component;

//@Component(modules = {WheelsModule.class, DieselEngineModule.class, PetrolEngineModule.class})
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
