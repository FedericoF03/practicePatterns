package com.structural_pattern.patterns.decorator;

import com.structural_pattern.patterns.decorator.models.Java;
import com.structural_pattern.patterns.decorator.models.decorator.CodeTraductorDecorator;
import com.structural_pattern.patterns.decorator.models.decorator.DebuggerDecorator;

//Patron de diseño estructural Facade  te permite añadir funcionalidades a
// objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.
public class Decorator {
    //En este patron se envuelve con diferentes funciones un mismo objeto, se llama decorator porque basicamente son como capas que se ponen encima
    //de un objeto, inclusive actuando sobre el segun a convencion de uno
    public void run() {
        new CodeTraductorDecorator(new DebuggerDecorator(new Java())).run();


    }
}
