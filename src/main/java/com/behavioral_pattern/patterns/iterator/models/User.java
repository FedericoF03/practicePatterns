package com.behavioral_pattern.patterns.iterator.models;


//Clase que se va a usar para el collectionUsers o mejor dicho collection iterator encargado de guardar todos los objetos de esta
//Clase y aplicar logica
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
