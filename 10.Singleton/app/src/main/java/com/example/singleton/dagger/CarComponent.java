package com.example.singleton.dagger;


import com.example.singleton.MainActivity;
import com.example.singleton.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

//@Component(modules = {WheelsModule.class, DieselEngineModule.class, PetrolEngineModule.class})
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    @Component.Builder
    interface  Builder{
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
        CarComponent build();
    }
}
