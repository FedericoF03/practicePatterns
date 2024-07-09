package com.behavioral_pattern.patterns.mediator.models;

import org.slf4j.LoggerFactory;

public class Twitch implements StreamComponent {
    private final IMediator mediator;

    public Twitch(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation() {
        LoggerFactory.getLogger(Twitch.class).info("Twitch");
        mediator.notify(this);
    }
}
