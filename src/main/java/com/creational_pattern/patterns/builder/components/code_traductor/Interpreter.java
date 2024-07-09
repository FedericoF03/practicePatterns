package com.creational_pattern.patterns.builder.components.code_traductor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Interpreter implements CodeTraductor {
    final Logger logger = LoggerFactory.getLogger(Compiler.class);

    void interpreting() {
        logger.info("Interpreting...");
    }

    @Override
    public void run() {
        interpreting();
    }
}
