package com.creational_pattern.patterns.factory_method.factory;


import com.creational_pattern.patterns.factory_method.models.languages.Java;
import com.creational_pattern.patterns.factory_method.models.languages.Language;

public class FactoryJava implements FactoryLanguage {
    @Override
    public Language createLanguage(String code) {
        return new Java(code);
    }
}
