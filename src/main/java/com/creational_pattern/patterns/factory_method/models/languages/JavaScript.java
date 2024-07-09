package com.creational_pattern.patterns.factory_method.models.languages;

import com.creational_pattern.patterns.factory_method.models.Interpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaScript implements Language, Interpreter {
    private static final Logger logger = LoggerFactory.getLogger(Java.class);

    private final String lenguageLevel = "medium";
    private final String typeLenguage = "Interpreter";
    public final String code;

    public JavaScript(String code) {
        this.code = code;
    }

    @Override
    public void executeCode() {
        runInterpreter();
        logger(code);
        logger(lenguageLevel);
        logger(typeLenguage);
        manageStack();
        stopCode();
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
    public void runInterpreter() {
        logger("Interpreting");
    }
}
