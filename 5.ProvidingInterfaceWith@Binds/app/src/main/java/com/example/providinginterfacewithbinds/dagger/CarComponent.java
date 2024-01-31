package com.example.providinginterfacewithbinds.dagger;

import com.example.providinginterfacewithbinds.MainActivity;
import com.example.providinginterfacewithbinds.car.Car;

import dagger.Component;

//@Component(modules = {WheelsModule.class, DieselEngineModule.class, PetrolEngineModule.class})
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
