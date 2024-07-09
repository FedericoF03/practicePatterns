package com.behavioral_pattern.patterns.iterator.models;

//Interfaz del contrato a lo iterar con sus respectivos metodos.
public interface IIteratorUser {
    void getNext();

    Boolean hasMore();

    void reset();

    User getById(int Id);
}
