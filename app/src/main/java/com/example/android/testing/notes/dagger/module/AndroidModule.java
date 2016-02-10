package com.example.android.testing.notes.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * A module for Android-specific dependencies which require a {@link Context} or
 * {@link android.app.Application} to create.
 */
@Module
public class AndroidModule {

    private final Application mApplication;

    public AndroidModule(Application app) {
        this.mApplication = app;
    }

    @Singleton
    @Provides
    public Application provideApplication(){
        return mApplication;
    }

}
