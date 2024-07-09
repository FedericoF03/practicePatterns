package com.behavioral_pattern.patterns.visitor.models;

//Interfaz de element que ejecuta su metodo con el visitor.
public interface Element {
    void accept(Visitor visitor);
}
