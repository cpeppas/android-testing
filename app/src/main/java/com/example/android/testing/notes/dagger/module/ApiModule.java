package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.data.NotesServiceApi;
import com.example.android.testing.notes.data.NotesServiceApiImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public NotesServiceApi providesNotesServiceApi() {
        return new NotesServiceApiImpl();
    }
}
