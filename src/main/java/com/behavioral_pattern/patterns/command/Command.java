package com.behavioral_pattern.patterns.command;


import com.behavioral_pattern.patterns.command.models.CommandBuy;
import com.behavioral_pattern.patterns.command.models.CommandSell;
import com.behavioral_pattern.patterns.command.models.InvokerEcommerceApi;
import com.behavioral_pattern.patterns.command.models.EcommerceReceiver;

public class Command {
    public void run() {

        //Se crea el invokerEcommerceApi (El invoker clase encargada de hacer el llamado) encargado de ejecutar el comando despues de armarlo
        //Se crea el receptor que tiene las acciones a hacer dentro.
        InvokerEcommerceApi invokerEcommerceApi = new InvokerEcommerceApi();
        EcommerceReceiver ecommerceReceiver = new EcommerceReceiver();


        // se setea el commando en este caso es, dentro del mismo se da el recibidor y la operacion que esperas que ejecute
        //Por consiguiente se ejecuta
        invokerEcommerceApi.setCommand(new CommandBuy(ecommerceReceiver));
        invokerEcommerceApi.executeCommand();

        //Lo mismos que arriba pero con otro command
        invokerEcommerceApi.setCommand(new CommandSell(ecommerceReceiver));
        invokerEcommerceApi.executeCommand();
    }
}
