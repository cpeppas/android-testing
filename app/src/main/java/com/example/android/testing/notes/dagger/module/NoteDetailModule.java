package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.notedetail.NoteDetailContract;
import com.example.android.testing.notes.notedetail.NoteDetailPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class NoteDetailModule {

    NoteDetailContract.View mView;

    public NoteDetailModule(NoteDetailContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public NoteDetailContract.UserActionsListener providePresenter(NotesRepository repository) {
        return new NoteDetailPresenter(repository, mView);
    }
}
