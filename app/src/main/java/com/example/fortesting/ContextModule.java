package com.example.fortesting;

import android.content.Context;

import dagger.Module;
import dagger.Provides;


public class ContextModule {

    Context context;

     ContextModule(Context context){
        this.context = context;
    }


    public Context getContext() {
        return context.getApplicationContext();
    }
}
