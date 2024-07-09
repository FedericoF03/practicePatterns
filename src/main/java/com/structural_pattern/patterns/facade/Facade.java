package com.structural_pattern.patterns.facade;


import com.structural_pattern.patterns.bridge.Bridge;
import com.structural_pattern.patterns.composite.Composite;
import com.structural_pattern.patterns.decorator.Decorator;

//Patron de diseño estructural Facade  es un patrón de diseño estructural
// que proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.
public class Facade {
    public void run() {
        //Literalmente esto vendira a ser Facade, es una clase que se encarga de esconder toda complejidad del algoritmo
        //que la integra por dentro, es como crear un .exe sin saber todo lo que lleva por atras.
        new Decorator().run();
        new Composite().exec();
        new Bridge().makeBridgeTest();
    }
}
