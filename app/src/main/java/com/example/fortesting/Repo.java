package com.example.fortesting;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;


public class Repo {
    @Inject
    Data data;

    public void repoText(){
        data.getDataText();
    }
}
