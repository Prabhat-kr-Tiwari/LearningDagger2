package com.example.componentbuilderbindsinstancenamed.dagger;




import com.example.componentbuilderbindsinstancenamed.car.DieselEngine;
import com.example.componentbuilderbindsinstancenamed.car.Engine;

import dagger.Module;
import dagger.Provides;


//there is so much redundancy in above code
@Module
public  class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

}

