package com.behavioral_pattern.patterns.mediator;

import com.behavioral_pattern.patterns.mediator.models.Kick;
import com.behavioral_pattern.patterns.mediator.models.Twitch;
import com.behavioral_pattern.patterns.mediator.models.MultiStreamMediator;

public class Mediator {
    public void run() {
        //Instancia de la clase Mediator
        MultiStreamMediator mediator = new MultiStreamMediator();

        //Instancia de los componentes que adentro tienen el mediator, se hace una conexion
        Twitch twitch = new Twitch(mediator);
        Kick kick = new Kick(mediator);

        //Se agarra las clases y se settea.
        mediator.setKick(kick);
        mediator.setTwitch(twitch);

        //Operacion que encadena otras
        twitch.operation();

    }
}
