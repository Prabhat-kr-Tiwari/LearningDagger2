package com.example.customscopescomponentdependencies.dagger;

import com.example.customscopescomponentdependencies.car.DieselEngine;
import com.example.customscopescomponentdependencies.car.Engine;

import dagger.Module;
import dagger.Provides;

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

