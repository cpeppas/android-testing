package com.example.android.testing.notes.dagger.module;

import com.example.android.testing.notes.addnote.AddNoteContract;
import com.example.android.testing.notes.addnote.AddNotePresenter;
import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.util.ImageFile;

import dagger.Module;
import dagger.Provides;

@Module
public class AddNoteModule {

    private AddNoteContract.View mView;

    public AddNoteModule(AddNoteContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public AddNoteContract.UserActionsListener providesPresenter(NotesRepository repository, ImageFile imageFile) {
        return new AddNotePresenter(repository, mView, imageFile);
    }
}
