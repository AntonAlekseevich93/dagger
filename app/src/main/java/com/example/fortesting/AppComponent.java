package com.example.fortesting;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    UseCase getUseCase();
}
