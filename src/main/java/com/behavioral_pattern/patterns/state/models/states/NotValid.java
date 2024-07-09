package com.behavioral_pattern.patterns.state.models.states;

import com.behavioral_pattern.patterns.state.models.GameContext;
import com.behavioral_pattern.patterns.state.models.IStateDifficulty;
import org.slf4j.LoggerFactory;

public class NotValid implements IStateDifficulty {
    private GameContext gameContext;

    @Override
    public void doThis() {
        LoggerFactory.getLogger(Hard.class).info("???");
        doThat();
    }

    @Override
    public void doThat() {
        LoggerFactory.getLogger(Hard.class).info("Return easy");
        gameContext.setState(new Easy());
    }

    public void setContext(GameContext gameContext) {
        this.gameContext = gameContext;
    }
}
