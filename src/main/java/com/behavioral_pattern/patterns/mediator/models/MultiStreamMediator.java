package com.behavioral_pattern.patterns.mediator.models;

import org.slf4j.LoggerFactory;

//Mediator se encarga de conectar todos y tiene la ejecucion que se conecta entre todos
public class MultiStreamMediator implements IMediator {
    private Twitch twitch;
    private Kick kick;

    public MultiStreamMediator setTwitch(Twitch twitch) {
        this.twitch = twitch;
        return this;
    }

    public void setKick(Kick kick) {
        this.kick = kick;
    }


    @Override
    public void notify(StreamComponent sender) {
        LoggerFactory.getLogger(MultiStreamMediator.class).info(sender.toString());
        if (sender == twitch) {
            reactOnA();
        } else if (sender == kick) {
            reactOnB();
        }
    }

    public void reactOnA() {
        kick.operation();
        LoggerFactory.getLogger(MultiStreamMediator.class).info("A react");
    }

    public void reactOnB() {
        LoggerFactory.getLogger(MultiStreamMediator.class).info("B react");
    }
}
