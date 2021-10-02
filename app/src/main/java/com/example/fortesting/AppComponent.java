package com.example.fortesting;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    UseCase getUseCase();
    Repo getRepo();
    void inject(UseCase useCase);
    void inject (Repo repo);
    void inject(Data data);
}
