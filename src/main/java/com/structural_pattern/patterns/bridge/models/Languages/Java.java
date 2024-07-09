package com.structural_pattern.patterns.bridge.models.Languages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Java implements Language {
    final Logger logger = LoggerFactory.getLogger(Java.class);

    @Override
    public void run() {
        logger.info("Run JAVA");
        runCode();
        stop();
    }

    @Override
    public void runCode() {
        logger.info("Run Code in JAVA");
    }

    @Override
    public void stop() {
        logger.info("Stop JAVA");
    }
}
