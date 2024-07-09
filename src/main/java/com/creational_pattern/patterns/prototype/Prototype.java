package com.creational_pattern.patterns.prototype;

import com.creational_pattern.patterns.prototype.models.languages.Java;
import com.creational_pattern.patterns.prototype.models.languages.Java23;
import com.creational_pattern.patterns.prototype.prototypes.LanguageClone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Prototype {
    Logger logger = LoggerFactory.getLogger(Prototype.class);

    public void makePrototype() {
        //Se crea la clase se ejecuta y se clona
        LanguageClone javaObject1 = new Java("main.java");
        javaObject1.executeCode();

        //La clonacion repite lo mismo que lo anterior
        Java javaObj2 = (Java) javaObject1.clone();
        javaObj2.setCode("main2.java");
        javaObj2.executeCode();

        //Creamos una que hereda de Java una subclase
        Java23 javaObj3 = new Java23(true);
        javaObj3.setCode("main3-java");
        javaObj3.executeCode();
        logger.info(javaObj3.getTemplateString().toString());

        logger.info(String.valueOf(javaObject1.equals(javaObj2)));
    }

}
