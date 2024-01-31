package com.example.providinginterfacewithbinds.dagger;


import com.example.providinginterfacewithbinds.car.Engine;
import com.example.providinginterfacewithbinds.car.PetrolEngine;

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
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

