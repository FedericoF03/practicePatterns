package com.behavioral_pattern.patterns.command.models;

//Esta clase emisora o tambien llamada invocadora es la que se isntancia en el cliente, de esta forma evitamos que interactue directamente.
public class InvokerEcommerceApi {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }


}
