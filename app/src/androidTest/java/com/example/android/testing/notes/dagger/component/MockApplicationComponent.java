package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.dagger.module.MockApiModule;
import com.example.android.testing.notes.dagger.module.MockDataModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MockDataModule.class, MockApiModule.class})
public interface MockApplicationComponent extends ApplicationComponent {
}
