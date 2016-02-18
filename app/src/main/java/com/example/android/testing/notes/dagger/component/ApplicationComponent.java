package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.dagger.module.AddNoteModule;
import com.example.android.testing.notes.dagger.module.AndroidModule;
import com.example.android.testing.notes.dagger.module.ApiModule;
import com.example.android.testing.notes.dagger.module.DataModule;
import com.example.android.testing.notes.dagger.module.NoteDetailModule;
import com.example.android.testing.notes.dagger.module.NotesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidModule.class, ApiModule.class, DataModule.class})
public interface ApplicationComponent {
    NotesComponent plus(NotesModule module);
    AddNoteComponent plus(AddNoteModule module);
    NoteDetailComponent plus(NoteDetailModule module);
}
