package com.behavioral_pattern.patterns.strategy.models;

import org.slf4j.LoggerFactory;

public class Hardware implements IStrategy {
    @Override
    public void execute(int number) {
        LoggerFactory.getLogger(Hardware.class).info("Strategy with {} {}", Hardware.class.getCanonicalName(), number);
    }
}
