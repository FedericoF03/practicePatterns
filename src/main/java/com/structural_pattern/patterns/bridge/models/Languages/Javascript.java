package com.structural_pattern.patterns.bridge.models.Languages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Javascript implements Language {
    final Logger logger = LoggerFactory.getLogger(Javascript.class);

    @Override
    public void run() {
        logger.info("Run JS");
        runCode();
        stop();
    }

    @Override
    public void runCode() {
        logger.info("Run Code in JS");
    }

    @Override
    public void stop() {
        logger.info("Stop JS");
    }
}
