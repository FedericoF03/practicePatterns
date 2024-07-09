package com.behavioral_pattern.patterns.command.models;

public class CommandSell implements Command {
    EcommerceReceiver ecommerceReceiver;

    public CommandSell(EcommerceReceiver ecommerceReceiver) {
        this.ecommerceReceiver = ecommerceReceiver;
    }

    @Override
    public void execute() {
        ecommerceReceiver.operationSell();
    }


}
