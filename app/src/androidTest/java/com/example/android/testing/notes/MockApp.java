package com.example.android.testing.notes;

import com.example.android.testing.notes.dagger.component.ApplicationComponent;
import com.example.android.testing.notes.dagger.component.DaggerMockApplicationComponent;
import com.example.android.testing.notes.dagger.module.MockApiModule;
import com.example.android.testing.notes.dagger.module.MockDataModule;

public class MockApp extends App {

    @Override
    protected ApplicationComponent createApplicationComponent(App context) {
        return DaggerMockApplicationComponent.builder()
                .mockApiModule(new MockApiModule())
                .mockDataModule(new MockDataModule())
                .build();
    }
}
