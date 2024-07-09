package com.behavioral_pattern.patterns.visitor.models;

import org.slf4j.LoggerFactory;

public class FireFighters implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void response() {
        LoggerFactory.getLogger(Police.class).info("going to the forests to put out the fire ");
    }
}
