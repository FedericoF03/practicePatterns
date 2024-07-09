package com.behavioral_pattern.patterns.command.models;

public class CommandBuy implements Command {
    private final EcommerceReceiver ecommerceReceiver;

    public CommandBuy(EcommerceReceiver ecommerceReceiver) {
        this.ecommerceReceiver = ecommerceReceiver;
    }

    @Override
    public void execute() {
        ecommerceReceiver.operationBuy();
    }
}
