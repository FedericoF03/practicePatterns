package com.behavioral_pattern.patterns.strategy.models;

//Clase que se encarga de almacenar la estrategia y ejecutar los metodos sin saber cual es
public class ContextExecute {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething(int number) {
        strategy.execute(number);
    }
}
