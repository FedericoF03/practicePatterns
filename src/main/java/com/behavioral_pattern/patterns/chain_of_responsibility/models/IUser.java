package com.behavioral_pattern.patterns.chain_of_responsibility.models;

//Interfaz de las clases que se extienden para hacer el handler.
public interface IUser {
    void userAccess();

    String getRange();
}
