package com.example.fortesting;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

public class UseCase {
    @Inject
    Repo repo;

    @Inject public UseCase(){ }

    public void getText() {
        repo.repoText();
    }
}
