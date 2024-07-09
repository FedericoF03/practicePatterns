package com.behavioral_pattern.patterns.mediator.models;

// Interfaz del objeto mediator que tiene un metodo que solo pasa un tipo en comun de los objetos a ayudar a comunicarse.
public interface IMediator {

    void notify(StreamComponent sender);

}
