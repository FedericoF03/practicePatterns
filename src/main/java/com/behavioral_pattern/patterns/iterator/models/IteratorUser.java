package com.behavioral_pattern.patterns.iterator.models;

import org.slf4j.LoggerFactory;
//Clase que tiene logica de los algoritmos.
public class IteratorUser implements IIteratorUser {
    private final CollectionUsers collection;
    private int iterationState = 0;

    public IteratorUser(CollectionUsers collection) {
        this.collection = collection;
    }

    @Override
    public void getNext() {
        if (hasMore()) {
            LoggerFactory.getLogger(IteratorUser.class).info("pass");
            iterationState++;
        }
    }

    @Override
    public Boolean hasMore() {
        return iterationState < collection.userList.size();
    }

    @Override
    public void reset() {
        this.iterationState = 0;
    }


    @Override
    public User getById(int Id) {
        return collection.userList.get(Id);
    }
}
