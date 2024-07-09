package com.creational_pattern;


import com.creational_pattern.patterns.factory.Factory;
import com.creational_pattern.patterns.factory.factory.FactoryLanguageImpl;

import com.creational_pattern.patterns.factory_method.FactoryMethod;
import com.creational_pattern.patterns.factory_method.factory.FactoryJava;
import com.creational_pattern.patterns.factory_method.factory.FactoryJavascript;

import com.creational_pattern.patterns.factory_Abstract.factory.FactoryJavaLanguage;
import com.creational_pattern.patterns.factory_Abstract.factory.FactoryJavascriptLanguage;
import com.creational_pattern.patterns.factory_Abstract.FactoryAbstract;

import com.creational_pattern.patterns.builder.Builder;

import com.creational_pattern.patterns.prototype.Prototype;

import com.creational_pattern.patterns.singleton.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;


//Los patrones creacionales proporcionan varios mecanismos de creación de
// objetos que incrementan la flexibilidad y la reutilización del código existente.

public class CreationalPattern {

    static Logger logger = LoggerFactory.getLogger(CreationalPattern.class);

    public static void main(String[] args) {
        SpringApplication.run(CreationalPattern.class, args);
        // en Factory, el patron de diseño creacional se crea una factoria donde reelige a traves de condicionales y un metodo
        //su ruta

        new Factory(new FactoryLanguageImpl().createLanguage("main.java")).execFactory();
        new Factory(new FactoryLanguageImpl().createLanguage("index.js")).execFactory();
        logger.info("\n \n \n");

        //en FactoryMethod, el patron de diseño creacional se crea una clase que implementa el contrato con la creacion de factorias.
        new FactoryMethod(new FactoryJava(), "main.java").execFactoryMethod();
        new FactoryMethod(new FactoryJavascript(), "index.js").execFactoryMethod();
        logger.info("\n \n \n");

        // La diferencia clave entre factory y factoryMethod es que mientras que en Factory se usa una misma factory con condicionales
        // en factory method se crea una factoria por cada implementacion y se separa desde algun service controlando
        // mejor las rutas, esta forma crea mas clases

        //En factoryAbstract, el patron de diseño creacional se crea una clase factoria que arma otras factorias
        // pero estas se diferencian por categoria.
        new FactoryAbstract(new FactoryJavascriptLanguage("index.js")).execFactoryMethod();
        new FactoryAbstract(new FactoryJavaLanguage("main.java")).execFactoryMethod();
        logger.info("\n \n \n");

        //En Builder, el patron de diseño creacional se crea una clase factoria director o tambien podria ser directamente en el main, pero es mas ordenado
        //hacerlo en una clase director ademas de generar reutilizacion
        new Builder().invoke();
        logger.info("\n \n \n");

        //Prototype, el patron de diseño creacional para copiar objetos, creando un prtotipo y de ahi partir y crear una clase propia.
        new Prototype().makePrototype();
        logger.info("\n \n \n");

        //Singleton, el patron de diseño creacional que solo instancia una sola vez, la forma de hacerlo es crear una clase
        //que esconda el constructor y manipularlo con un metodo con una condicional de verificacion de la existencia dentro de sus
        //propiedades
        logger.info(Singleton.getInstance("Windows").value);
        logger.info(Singleton.getInstance("Linux").value);
        logger.info("\n \n \n");

    }
}
