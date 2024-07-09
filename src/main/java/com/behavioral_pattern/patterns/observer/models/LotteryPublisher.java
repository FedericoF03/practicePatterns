package com.behavioral_pattern.patterns.observer.models;

import java.util.ArrayList;
import java.util.List;


//El publisher o el que observa o el notificador, los nombres que quieras darle pero es el que pega el grito el que reacciona
// primero y le envia esa reaccion a su lista interna
public class LotteryPublisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String action;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(action);
        }
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void mainBusinessLogic() {
        notifySubscribers();
    }
}
