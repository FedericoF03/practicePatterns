package com.behavioral_pattern.patterns.observer;

import com.behavioral_pattern.patterns.observer.models.User;
import com.behavioral_pattern.patterns.observer.models.LotteryPublisher;
import org.slf4j.LoggerFactory;

public class Observer {
    public void run() {
        //Se crea el notificador o publisher o invocador que es el que avisa de cambios
        LotteryPublisher lotteryPublisher = new LotteryPublisher();
        // Se crea una clase a eliminar a futuro pero actualmente se agrega (Esta clase es la que va a escuchar los cambios y por ende hacer algo
        // debido a ello)
        User userToEliminate = new User("FF", "42.657.875");

        //Se agregan clases de prueba y la que se planea eliminar despues
        lotteryPublisher.subscribe(new User("Carlos", "43.657.875"));
        lotteryPublisher.subscribe(userToEliminate);
        lotteryPublisher.subscribe(new User("Gabi", "42.657.364"));

        //Se settea un estado inicial para action
        lotteryPublisher.setAction("start");
        //Se ejecuta la logica lo cual cambia el estado para los tres
        lotteryPublisher.mainBusinessLogic();
        //Se elimina uno de los escuchadores de la lista que justamente almacena estos mismos
        lotteryPublisher.unSubscribe(userToEliminate);

        //Se settea otro estado
        lotteryPublisher.setAction("running");
        //Se comprueba si la logica aplica, si es el cadso deberia ejecutarse solo la primera vez y la otra no hacer efecto alguno porque
        //el action no es diferente
        lotteryPublisher.mainBusinessLogic();
        lotteryPublisher.mainBusinessLogic();

        //Para finalizar un ultimo setteo
        lotteryPublisher.setAction("finish");
        lotteryPublisher.mainBusinessLogic();

        //Se comprueba el estado de la clase eliminada para ver si la logica se aplica
        LoggerFactory.getLogger(Observer.class).info(userToEliminate.getAction());

    }
}
