package com.structural_pattern.patterns.decorator.models;

import org.slf4j.LoggerFactory;

//Este es el componente concreto que extiende de la interfaz de componente
public class Java implements Language {

    @Override
    public void run() {
        LoggerFactory.getLogger(Java.class).info("Run in Java");
    }
}
