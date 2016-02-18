package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.dagger.module.NotesModule;
import com.example.android.testing.notes.dagger.scope.NotesScope;
import com.example.android.testing.notes.notes.NotesFragment;

import dagger.Subcomponent;

@NotesScope
@Subcomponent(modules = {NotesModule.class})
public interface NotesComponent {
    void inject(NotesFragment fragment);
}
