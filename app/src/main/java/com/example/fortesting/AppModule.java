package com.example.fortesting;

import android.content.Context;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    UseCase useCase(){
        return new UseCase();
    }

    @Provides
    Repo repo(){
        return new Repo();
    }

    @Provides
    Data data(){
        return new Data();
    }

}
