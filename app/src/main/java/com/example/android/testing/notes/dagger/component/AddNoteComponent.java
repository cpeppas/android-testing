package com.example.android.testing.notes.dagger.component;

import com.example.android.testing.notes.addnote.AddNoteFragment;
import com.example.android.testing.notes.dagger.module.AddNoteModule;
import com.example.android.testing.notes.dagger.scope.AddNoteScope;

import dagger.Subcomponent;

@AddNoteScope
@Subcomponent(modules = {AddNoteModule.class})
public interface AddNoteComponent {
    void inject(AddNoteFragment fragment);
}
