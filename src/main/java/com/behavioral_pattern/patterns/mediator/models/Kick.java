package com.behavioral_pattern.patterns.mediator.models;

import org.slf4j.LoggerFactory;

public class Kick implements StreamComponent {
    private final IMediator mediator;

    public Kick(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation() {
        LoggerFactory.getLogger(Kick.class).info("Kick");
        LoggerFactory.getLogger(Kick.class).info(mediator.getClass().getName());
    }
}
