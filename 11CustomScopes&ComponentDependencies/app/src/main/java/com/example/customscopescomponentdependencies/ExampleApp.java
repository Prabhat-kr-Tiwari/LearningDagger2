package com.example.customscopescomponentdependencies;
import android.app.Application;
import com.example.customscopescomponentdependencies.dagger.AppComponent;
import com.example.customscopescomponentdependencies.dagger.DaggerAppComponent;
public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerAppComponent.create();
    }
    public AppComponent getAppComponent(){
        return component;
    }
}
