package com.behavioral_pattern.patterns.strategy.models;

import org.slf4j.LoggerFactory;

public class Exe implements IStrategy {
    @Override
    public void execute(int number) {
        LoggerFactory.getLogger(Hardware.class).info("Strategy with {} {}", Exe.class.getCanonicalName(), number);
    }
}
