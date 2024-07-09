package com.creational_pattern.patterns.factory_method.models.languages;

//La interfaz o contrato que tienen todos los objetos que se extienden a language como clase superior o comun
public interface Language {

    void executeCode();

    void manageStack();

    void manageGarbageCollector();

    void stopCode();

    void returnError();

    void logger(String code);
}
