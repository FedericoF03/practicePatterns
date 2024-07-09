package com.behavioral_pattern.patterns.memento.models;



public class MementoCheckpoint implements IMemento {
    private final Checkpoints state;
    private final OriginatorSave originatorSave;

    public MementoCheckpoint(OriginatorSave originatorSave, Checkpoints state) {
        this.state = state;
        this.originatorSave = originatorSave;
    }

    @Override
    public void restore() {
        originatorSave.setState(state);
    }
}
