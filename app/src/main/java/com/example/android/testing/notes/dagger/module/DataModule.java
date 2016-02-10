package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.data.InMemoryNotesRepository;
import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.data.NotesServiceApi;
import com.example.android.testing.notes.util.ImageFile;
import com.example.android.testing.notes.util.ImageFileImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    @Singleton
    public NotesRepository provideNotesRepository(NotesServiceApi api) {
        return new InMemoryNotesRepository(api);
    }


    @Provides
    @Singleton
    public ImageFile provideImageFile() {
        return new ImageFileImpl();
    }
}
