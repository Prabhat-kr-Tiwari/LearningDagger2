package com.example.componentbuilderbindsinstancenamed.dagger;



import com.example.componentbuilderbindsinstancenamed.car.Engine;
import com.example.componentbuilderbindsinstancenamed.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/*@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;

    }
}*/
//there is so much redundancy in above code
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

