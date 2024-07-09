package com.creational_pattern.patterns.factory.models.languages;

import com.creational_pattern.patterns.factory.models.Compiler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Java implements Language, Compiler {

    private static final Logger logger = LoggerFactory.getLogger(Java.class);

    private final String lenguageLevel = "medium";
    private final String typeLenguage = "Interpreter";
    public final String code;

    public Java(String code) {
        this.code = code;
    }

    @Override
    public void executeCode() {
        compile();
        logger(code);
        logger(lenguageLevel);
        logger(typeLenguage);
        manageStack();
    }


    @Override
    public void manageStack() {
        logger(code);
        logger("sending the class, object and all reference types to garbage");
        manageGarbageCollector();
    }

    @Override
    public void manageGarbageCollector() {
        logger("clean");
    }

    @Override
    public void stopCode() {
        logger("stop code");
    }

    @Override
    public void returnError() {
        stopCode();
        throw new IllegalArgumentException("Error in the line:");
    }

    @Override
    public void logger(String code) {
        logger.info(code);
    }

    @Override
    public void compile() {
        logger("Compiling");
    }
}
