package com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers;

import com.behavioral_pattern.patterns.chain_of_responsibility.models.RequestUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Base handler el que se encarga del traspaso a la siguiente peticion, revisa si next tiene algo sino termina ahi. Sus hijos
//tienen toda la logica este solo se encarga de dirrecionar y en caso de finalizar si queres un mensaje o cuando pasa
// al siguente ademas de pasarlo a su propiedad next
public class CommonBaseHandler implements AccessHandler {
    private AccessHandler next;
    Logger logger = LoggerFactory.getLogger(CommonBaseHandler.class);

    @Override
    public void requestHandler(RequestUser user) {
        if (next != null) {
            next.requestHandler(user);
        }
    }

    @Override
    public void setNext(AccessHandler next) {
        this.next = next;
    }
}
