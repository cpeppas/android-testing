package com.example.android.testing.notes.dagger.component;


import com.example.android.testing.notes.dagger.module.NoteDetailModule;
import com.example.android.testing.notes.dagger.scope.NoteDetailScope;
import com.example.android.testing.notes.notedetail.NoteDetailFragment;

import dagger.Subcomponent;

@NoteDetailScope
@Subcomponent(modules = {NoteDetailModule.class})
public interface NoteDetailComponent {
    void inject(NoteDetailFragment fragment);
}
