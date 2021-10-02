package com.example.fortesting;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

public class UseCase {
    @Inject
    Repo repo;

    public void getText() {
        repo.repoText();
    }
}
