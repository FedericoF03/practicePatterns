package com.creational_pattern.patterns.factory.models.languages;

//interfaz de los lenguajes para la factoria que siga esos
public interface Language {

    void executeCode();

    void manageStack();

    void manageGarbageCollector();

    void stopCode();

    void returnError();

    void logger(String code);
}
