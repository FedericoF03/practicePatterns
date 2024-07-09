package com.behavioral_pattern.patterns.observer.models;

import org.slf4j.LoggerFactory;

import java.util.Objects;


//Clase que hace contrato con Subscriber para indicar que tiene que aplicar si o si lo que pide
//Es una clase que va a ser observada denominada suscriptor.
public class User implements Subscriber {
    String name;
    String DNI;
    String action;

    public User(String name, String DNI) {
        this.name = name;
        this.DNI = DNI;
    }

    public String getAction() {
        return action;
    }

    @Override
    public void update(String action) {
//        LoggerFactory.getLogger(User.class).info("this have the action in update(), the value of action is {}", action);
        if (!Objects.equals(this.action, action)) {
            this.action = action;
            executeSomething();
        }
    }

    public void executeSomething() {
        LoggerFactory.getLogger(User.class).info(action);
    }
}
