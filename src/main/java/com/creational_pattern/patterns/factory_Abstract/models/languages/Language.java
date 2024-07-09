package com.creational_pattern.patterns.factory_Abstract.models.languages;

//Interfaz para el lenguaje que seria una de las clases que se crean en la factoria.
public interface Language {

    void executeCode();

    void manageStack();

    void manageGarbageCollector();

    void stopCode();

    void returnError();

    void logger(String code);


}
