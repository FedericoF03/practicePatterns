package com.creational_pattern.patterns.builder.components.code_traductor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compiler implements CodeTraductor {
    final Logger logger = LoggerFactory.getLogger(Compiler.class);

    void compile() {
        logger.info("Compiling...");
    }

    @Override
    public void run() {
        compile();
    }
}
