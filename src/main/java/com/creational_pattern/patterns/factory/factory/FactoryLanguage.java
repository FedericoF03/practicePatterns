package com.creational_pattern.patterns.factory.factory;

import com.creational_pattern.patterns.factory.models.languages.Language;

// Se implementa a la clase de implementacion de construcciones de lenguajes
public interface FactoryLanguage {
    Language createLanguage(String code);
}
