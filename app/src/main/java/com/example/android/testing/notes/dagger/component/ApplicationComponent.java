package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.addnote.AddNoteFragment;
import com.example.android.testing.notes.dagger.module.AndroidModule;
import com.example.android.testing.notes.dagger.module.ApiModule;
import com.example.android.testing.notes.dagger.module.DataModule;
import com.example.android.testing.notes.notedetail.NoteDetailFragment;
import com.example.android.testing.notes.notes.NotesFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidModule.class, ApiModule.class, DataModule.class})
public interface ApplicationComponent {
    void inject(AddNoteFragment fragment);
    void inject(NoteDetailFragment fragment);
    void inject(NotesFragment fragment);


    // Exported for child-components.
    // Application application();
}
