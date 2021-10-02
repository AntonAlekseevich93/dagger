package com.example.fortesting;

import javax.inject.Inject;

public class Repo {
    @Inject
    Data data;

    @Inject
    public Repo() {
    }

    public void repoText() {
        data.getDataText();
    }
}
