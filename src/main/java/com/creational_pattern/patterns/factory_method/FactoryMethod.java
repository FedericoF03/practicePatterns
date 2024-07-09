package com.creational_pattern.patterns.factory_method;


import com.creational_pattern.patterns.factory_method.factory.FactoryLanguage;

//Dicho anteriormente esto es una extension esto controla la rama
//Aca se mantiene y se crea el lenguaje que devuelve un language, despues se ejecuta, aqui tendriamos toda la logica
// seria como el service, sin embargo por efectos practicos, solo recibe la clase de la factoria y ejecuta sus funciones
// para crear las clases referentes, prosigue a ejecutarlo inmediatamente.
public class FactoryMethod {
    FactoryLanguage factoryLanguage;
    String code;

    public FactoryMethod(FactoryLanguage factoryLanguage, String code) {
        this.factoryLanguage = factoryLanguage;
        this.code = code;
    }

    public void execFactoryMethod() {
        factoryLanguage.createLanguage(code).executeCode();
    }
}
