package com.behavioral_pattern.patterns.state.models.states;

import com.behavioral_pattern.patterns.state.models.GameContext;
import com.behavioral_pattern.patterns.state.models.IStateDifficulty;
import org.slf4j.LoggerFactory;

public class Hard implements IStateDifficulty {
    private GameContext gameContext;

    @Override
    public void doThis() {
        LoggerFactory.getLogger(Hard.class).info("Game HARD");
    }

    @Override
    public void doThat() {
        LoggerFactory.getLogger(Hard.class).info("Difficult enemies 100");
    }

    public void setContext(GameContext gameContext) {
        this.gameContext = gameContext;
    }
}
