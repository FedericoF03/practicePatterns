package com.creational_pattern.patterns.prototype.models.languages;

public interface Language {

    void executeCode();

    void manageStack();

    void manageGarbageCollector();

    void stopCode();

    void returnError();

    void logger(String code);
}
