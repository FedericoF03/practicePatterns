package com.behavioral_pattern.patterns.chain_of_responsibility;


import com.behavioral_pattern.patterns.chain_of_responsibility.models.Admin;
import com.behavioral_pattern.patterns.chain_of_responsibility.models.RequestUser;
import com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers.CheckRangeHandler;
import com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers.CheckTokenHandler;

public class ChainOfResponsibility {
    public void run() {
        //Se crea el request Obj de la clase que ejecuta cosas optimizadas, en este caso yo quise crear el request con
        //mejor compatibilidad, si bien ejecuta los metodos trae mucho de la interfaz de user para poder llevarse, sin embargo
        //no es necesario.
        RequestUser requestUser = new RequestUser();
////        requestUser.setUser(new User());
        requestUser.setUser(new Admin());
//        requestUser.setUser(new Moderator());
        //Se crean los handler
        CheckTokenHandler H1 = new CheckTokenHandler();
        CheckRangeHandler H2 = new CheckRangeHandler();
        //Se setea un handler dentro de otro, dependiendo el orden que quieras.
        H1.setNext(H2);
        //Se ejecuta el primer handler que dentro la logica le dice que si se cumple lo que quiere ejecute el siguiente sin embargo eso
        //es en caso de no tener un  base handler que es un handler que justamente extrae esa logica y por predeterminado es el que settea
        // sin embargo la herencia nos permite usar sus metodos en los hijos.
        H1.requestHandler(requestUser);

    }
}
