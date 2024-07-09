package com.behavioral_pattern.patterns.memento.models;

public class OriginatorSave implements IOriginator {
    private Checkpoints state;

    public void setState(Checkpoints state) {
        this.state = state;
    }

    // Era para probar pero directamente no se deberia extraer.
    //public Checkpoints getState() {
    // return state;
    //}

    @Override
    public MementoCheckpoint save() {
        return new MementoCheckpoint(this, state);
    }
}
