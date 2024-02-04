package com.example.customscopescomponentdependencies.dagger;
import com.example.customscopescomponentdependencies.car.Driver;
import javax.inject.Singleton;
import dagger.Component;
@Singleton
@Component(modules = DriverModule.class )
public interface AppComponent {
    Driver gerDriver();
}
