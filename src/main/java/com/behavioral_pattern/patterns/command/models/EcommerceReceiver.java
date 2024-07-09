package com.behavioral_pattern.patterns.command.models;

import org.slf4j.LoggerFactory;

public class EcommerceReceiver {

    public void operationBuy() {
        LoggerFactory.getLogger(EcommerceReceiver.class).info("Buy Item");
    }

    public void operationSell() {
        LoggerFactory.getLogger(EcommerceReceiver.class).info("Sell Item");
    }
}
