package com.behavioral_pattern.patterns.state.models;

public class GameContext {
    private IStateDifficulty state;

    public GameContext(IStateDifficulty initialState) {
        this.state = initialState;
        state.setContext(this);
    }

    public void setState(IStateDifficulty state) {
        this.state = state;
        state.setContext(this);
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }
}
