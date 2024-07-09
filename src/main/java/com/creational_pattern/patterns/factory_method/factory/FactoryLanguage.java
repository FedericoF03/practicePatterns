package com.creational_pattern.patterns.factory_method.factory;

import com.creational_pattern.patterns.factory_method.models.languages.Language;

// Se implementa a todas las clases que necesiten usar un metodo de creacion del lenguaje
public interface FactoryLanguage {
    Language createLanguage(String code);
}
