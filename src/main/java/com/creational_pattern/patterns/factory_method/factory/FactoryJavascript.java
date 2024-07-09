package com.creational_pattern.patterns.factory_method.factory;


import com.creational_pattern.patterns.factory_method.models.languages.JavaScript;
import com.creational_pattern.patterns.factory_method.models.languages.Language;

public class FactoryJavascript implements FactoryLanguage {
    @Override
    public Language createLanguage(String code) {
        return new JavaScript(code);
    }
}
