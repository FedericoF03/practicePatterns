package com.behavioral_pattern.patterns.memento.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

//Care taker o cuidadora es una clase que se encarga de almacenar todo el historial o cache de un objeto, es como un almacen
//para memento.
public class CareTaker {
    private final List<MementoCheckpoint> history = new ArrayList<>();

    public void addMemento(MementoCheckpoint mementoCheckpoint) {
        history.add(mementoCheckpoint);
    }

    public MementoCheckpoint getMemento(int index) {
        return history.get(index);
    }

    public void seeHistory() {
        LoggerFactory.getLogger(CareTaker.class).info(history.toString());
    }
}
