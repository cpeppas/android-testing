package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.notes.NotesContract;
import com.example.android.testing.notes.notes.NotesPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class NotesModule {

    NotesContract.View mView;

    public NotesModule(NotesContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public NotesContract.UserActionsListener providesPresenter(NotesRepository repository) {
        return new NotesPresenter(repository, mView);
    }
}
