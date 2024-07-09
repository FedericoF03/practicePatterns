package com.behavioral_pattern.patterns.state.models.states;

import com.behavioral_pattern.patterns.state.models.GameContext;
import com.behavioral_pattern.patterns.state.models.IStateDifficulty;
import org.slf4j.LoggerFactory;

public class Medium implements IStateDifficulty {
    private GameContext gameContext;

    @Override
    public void doThis() {
        LoggerFactory.getLogger(Hard.class).info("Game medium");
    }

    @Override
    public void doThat() {
        LoggerFactory.getLogger(Hard.class).info("Difficult enemies 50");
    }

    public void setContext(GameContext gameContext) {
        this.gameContext = gameContext;
    }
}
