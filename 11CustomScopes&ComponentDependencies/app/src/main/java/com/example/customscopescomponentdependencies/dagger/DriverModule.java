package com.example.customscopescomponentdependencies.dagger;
import com.example.customscopescomponentdependencies.car.Driver;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
@Module
public  abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
