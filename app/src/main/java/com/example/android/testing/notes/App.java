package com.example.android.testing.notes;

import android.app.Application;

import com.example.android.testing.notes.dagger.component.ApplicationComponent;
import com.example.android.testing.notes.dagger.component.DaggerApplicationComponent;
import com.example.android.testing.notes.dagger.module.AndroidModule;
import com.example.android.testing.notes.dagger.module.ApiModule;
import com.example.android.testing.notes.dagger.module.DataModule;

public class App extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = createApplicationComponent(this);
    }

    protected ApplicationComponent createApplicationComponent(App context) {
        return DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule(context))
                .apiModule(new ApiModule())
                .dataModule(new DataModule())
                .build();
    }

    public ApplicationComponent component() {
        return mComponent;
    }
}
