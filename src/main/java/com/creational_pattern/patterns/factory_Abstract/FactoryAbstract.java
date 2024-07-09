package com.creational_pattern.patterns.factory_Abstract;


import com.creational_pattern.patterns.factory_Abstract.factory.FactoryLanguage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Dicho anteriormente esto es una extension esto controla la rama
//Aca se mantiene y se crea el lenguaje que devuelve un language, despues se ejecuta, aqui tendriamos toda la logica
// seria como el service, sin embargo por efectos practicos, solo recibe la clase de la factoria y ejecuta sus funciones
// para crear las clases referentes, prosigue a ejecutarlo inmediatamente.
public class FactoryAbstract {
    FactoryLanguage factoryLanguage;


    public FactoryAbstract(FactoryLanguage factoryLanguage) {
        this.factoryLanguage = factoryLanguage;

    }
    //Ejecucion de varias creaciones del mismo tipo
    public void execFactoryMethod() {
        factoryLanguage.createParadigm();
        factoryLanguage.createDebugger();
        factoryLanguage.createLanguage().executeCode();

    }


}
