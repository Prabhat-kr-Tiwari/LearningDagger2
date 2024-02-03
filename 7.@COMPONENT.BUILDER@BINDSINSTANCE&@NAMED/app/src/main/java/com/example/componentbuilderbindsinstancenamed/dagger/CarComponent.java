package com.example.componentbuilderbindsinstancenamed.dagger;
import com.example.componentbuilderbindsinstancenamed.MainActivity;
import com.example.componentbuilderbindsinstancenamed.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

//@Component(modules = {WheelsModule.class, DieselEngineModule.class, PetrolEngineModule.class})
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
