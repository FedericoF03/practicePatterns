package com.behavioral_pattern.patterns.strategy.models;


//Contrato de estrategias que basicamente solo declara el metodo que necesita
public interface IStrategy {
    void execute(int number);
}
