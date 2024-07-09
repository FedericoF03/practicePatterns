package com.behavioral_pattern.patterns.state.models.states;

import com.behavioral_pattern.patterns.state.models.GameContext;
import com.behavioral_pattern.patterns.state.models.IStateDifficulty;
import org.slf4j.LoggerFactory;

public class Easy implements IStateDifficulty {
    private GameContext gameContext;

    @Override
    public void doThis() {
        LoggerFactory.getLogger(Easy.class).info("Game easy");
    }

    @Override
    public void doThat() {
        LoggerFactory.getLogger(Easy.class).info("Difficult enemies 0");
    }

    public void setContext(GameContext gameContext) {
        this.gameContext = gameContext;
    }
}
