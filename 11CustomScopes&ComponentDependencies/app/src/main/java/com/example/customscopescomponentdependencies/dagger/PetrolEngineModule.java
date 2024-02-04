package com.example.customscopescomponentdependencies.dagger;


import com.example.customscopescomponentdependencies.car.Engine;
import com.example.customscopescomponentdependencies.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

