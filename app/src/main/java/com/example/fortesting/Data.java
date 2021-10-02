package com.example.fortesting;

import javax.inject.Inject;

import dagger.Provides;


public class Data {

     @Inject
     public Data() {
     }

     public void getDataText(){
        System.out.println("ДАТА ТЕКСТ");
    }
}
