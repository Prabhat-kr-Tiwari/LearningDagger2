package com.example.customscopescomponentdependencies.dagger;
import com.example.customscopescomponentdependencies.MainActivity;
import com.example.customscopescomponentdependencies.car.Car;
import javax.inject.Named;
import dagger.BindsInstance;
import dagger.Component;
@PerActivity
@Component(dependencies = AppComponent.class,modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    @Component.Builder
    interface  Builder{
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
        Builder appComponent(AppComponent component);
        ActivityComponent build();
    }
}
