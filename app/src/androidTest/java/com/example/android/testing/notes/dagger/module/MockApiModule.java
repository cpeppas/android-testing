package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.data.FakeNotesServiceApiImpl;
import com.example.android.testing.notes.data.NotesServiceApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockApiModule {

    @Provides
    @Singleton
    public NotesServiceApi providesNotesServiceApi() {
        return new FakeNotesServiceApiImpl();
    }
}
