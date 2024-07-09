package com.creational_pattern.patterns.builder.models.languages;

import com.creational_pattern.patterns.builder.components.Debugger.Debugger;
import com.creational_pattern.patterns.builder.components.code_traductor.CodeTraductor;
import com.creational_pattern.patterns.builder.components.paradigm_type.ParadigmType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaScript implements Language {
    private static final Logger logger = LoggerFactory.getLogger(Java.class);
    private String lenguageLevel;
    private CodeTraductor typeTraductorCode;
    private String code;
    private Debugger debugger;
    private ParadigmType paradigmType;

    public JavaScript(String lenguageLevel, CodeTraductor typeTraductorCode, String code, Debugger debugger, ParadigmType paradigmType) {
        this.lenguageLevel = lenguageLevel;
        this.typeTraductorCode = typeTraductorCode;
        this.code = code;
        this.debugger = debugger;
        this.paradigmType = paradigmType;
    }

    public String getLenguageLevel() {
        return lenguageLevel;
    }

    public CodeTraductor getTypeTraductorCode() {
        return typeTraductorCode;
    }

    public String getCode() {
        return code;
    }

    public Debugger getDebugger() {
        return debugger;
    }

    public ParadigmType getParadigmType() {
        return paradigmType;
    }

    @Override
    public void executeCode() {
        typeTraductorCode.run();
        logger(code);
        logger(lenguageLevel);
        logger(paradigmType.getClass().getTypeName());
        manageStack();
        debugger.run();
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
}
