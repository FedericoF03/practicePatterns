package com.behavioral_pattern.patterns.iterator;


import com.behavioral_pattern.patterns.iterator.models.CollectionUsers;
import com.behavioral_pattern.patterns.iterator.models.User;

public class Iterator {
    public void run() {

        //Se crea la collection iterator class que es la encargada de instanciar dentro de un metodo la clase que almacena
        //los algoritmos y en parte tambien puede aplicar su logica para extraer lo que quieras.
        CollectionUsers collectionUsers = new CollectionUsers();

        //Se agregar a la lista que esta instanciada adentro de 0 con 3 Users en este caso.
        collectionUsers.addConcreteList(new User(1, "Carlos"));
        collectionUsers.addConcreteList(new User(2, "Fefe"));
        collectionUsers.addConcreteList(new User(3, "Gabi"));

        //Recorro para dar una lectura a los nombres.
        collectionUsers.recordList();

        //Le pido que me traiga uno por id
        collectionUsers.getUserById(0);
    }
}
