package com.creational_pattern.patterns.builder.components.Debugger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebuggerJava implements Debugger {
    private final Logger logger = LoggerFactory.getLogger(DebuggerJava.class);

    @Override
    public void run() {
        logger.info("Debuggin in java");
    }
}
