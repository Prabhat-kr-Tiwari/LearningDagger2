package com.example.componentbuilderbindsinstancenamed.dagger;


import com.example.componentbuilderbindsinstancenamed.car.Rims;
import com.example.componentbuilderbindsinstancenamed.car.Tires;
import com.example.componentbuilderbindsinstancenamed.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return  new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);

    }
}
