package com.example.providinginterfacewithbinds.dagger;


import com.example.providinginterfacewithbinds.car.DieselEngine;
import com.example.providinginterfacewithbinds.car.Engine;

import dagger.Binds;
import dagger.Module;


//there is so much redundancy in above code
@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}

