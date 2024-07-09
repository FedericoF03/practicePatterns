package com.behavioral_pattern.patterns.memento;


import com.behavioral_pattern.patterns.memento.models.CareTaker;
import com.behavioral_pattern.patterns.memento.models.Checkpoints;
import com.behavioral_pattern.patterns.memento.models.OriginatorSave;
import org.slf4j.LoggerFactory;

public class Memento {
    public void run() {

        //OriginatorSave guarda mementos y va cambiando con el setteo
        OriginatorSave originatorSave = new OriginatorSave();

        //Creamos clase cuidadora.
        CareTaker careTaker = new CareTaker();

        //Seteamos un checkpoint
        originatorSave.setState(new Checkpoints("Salvage", 1));
        //Originator con save vuelve un memento que se agrega al cuidador, se agrega a la lista
        careTaker.addMemento(originatorSave.save());

        //Lo mismo que aca.
        originatorSave.setState(new Checkpoints("Desert", 2));
        careTaker.addMemento(originatorSave.save());

        originatorSave.setState(new Checkpoints("Steam", 3));
        careTaker.addMemento(originatorSave.save());

        //Metodo que hice para ver historial sin embargo esto deberia ser privado
        careTaker.seeHistory();

        //Restore a originator
        careTaker.getMemento(0).restore();
        
        //LoggerFactory.getLogger(Memento.class).info("{}", originatorSave.getState().getName());

    }
}
