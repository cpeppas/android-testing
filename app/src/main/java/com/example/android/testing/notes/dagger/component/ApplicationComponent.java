package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.dagger.module.AndroidModule;
import com.example.android.testing.notes.dagger.module.ApiModule;
import com.example.android.testing.notes.dagger.module.DataModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidModule.class, ApiModule.class, DataModule.class})
public interface ApplicationComponent {

    // Exported for child-components.
    // Application application();
}
