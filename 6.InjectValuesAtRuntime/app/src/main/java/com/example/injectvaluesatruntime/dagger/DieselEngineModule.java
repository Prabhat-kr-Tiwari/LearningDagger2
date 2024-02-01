package com.example.injectvaluesatruntime.dagger;




import com.example.injectvaluesatruntime.car.DieselEngine;
import com.example.injectvaluesatruntime.car.Engine;

import dagger.Binds;
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
       Engine provideEngine(){
        return new DieselEngine(horsePower);
    }

}

