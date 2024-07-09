package com.creational_pattern.patterns.factory.factory;

import com.creational_pattern.patterns.factory.models.languages.Java;
import com.creational_pattern.patterns.factory.models.languages.JavaScript;
import com.creational_pattern.patterns.factory.models.languages.Language;

//A diferencia de factory method esta se hace responsable de todas las clases. Esto viola el principio de open/closed,
// por ende es mejor declarar varios constructores de la manera factorymethod y no esta.
public class FactoryLanguageImpl implements FactoryLanguage {
    @Override
    public Language createLanguage(String code) {
        if ("main.java".equalsIgnoreCase(code)) {
            return new Java(code);
        } else {
            return new JavaScript(code);
        }
    }
}
