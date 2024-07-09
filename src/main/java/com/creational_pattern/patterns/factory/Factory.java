package com.creational_pattern.patterns.factory;

import com.creational_pattern.patterns.factory.models.languages.Language;

//Dicho anteriormente esto es una extension esto controla la rama
public class Factory {
    Language factoryLanguage;


    public Factory(Language factoryLanguage) {
        this.factoryLanguage = factoryLanguage;
    }

    public void execFactory() {
        factoryLanguage.executeCode();
    }
}
