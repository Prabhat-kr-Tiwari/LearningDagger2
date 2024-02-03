package com.example.singleton.dagger;


import com.example.singleton.car.Engine;
import com.example.singleton.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    /*    public PetrolEngineModule(int horsePower) {
            this.horsePower = horsePower;
        }

        private int horsePower;

        @Provides
         Engine providesEngine(){
            return new DieselEngine(horsePower);
        }*/
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

