package com.behavioral_pattern.patterns.strategy.models;

import org.slf4j.LoggerFactory;

public class Web implements IStrategy {

    @Override
    public void execute(int number) {
        LoggerFactory.getLogger(Hardware.class).info("Strategy with {} {}", Web.class.getCanonicalName(), number);
    }
}
