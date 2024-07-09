package com.behavioral_pattern.patterns.iterator.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

//Clase que implementa el contratio de collection para crear un iterator que es el encargado del algoritmo de ordenamiento,
// Busqueda, etc. Esta clase se encarga de agregarlo en la lista y llamar a esas funciones.
public class CollectionUsers implements ICollectionUsers {
    Logger logger = LoggerFactory.getLogger(CollectionUsers.class);
    List<User> userList = new ArrayList<>();

    public void addConcreteList(User user) {
        userList.add(user);
    }

    public void getUserById(int Id) {
        logger.info(createIterator().getById(Id).getName());
    }

    public void recordList() {
        for (User user : userList) {
            logger.info(user.getName());
        }
    }

    @Override
    public IIteratorUser createIterator() {
        return new IteratorUser(this);
    }
}
