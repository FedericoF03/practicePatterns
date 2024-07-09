package com.creational_pattern.patterns.prototype.models.languages;

import com.creational_pattern.patterns.prototype.models.Compiler;
import com.creational_pattern.patterns.prototype.prototypes.LanguageClone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Java extends LanguageClone implements Language, Compiler {

    private static final Logger logger = LoggerFactory.getLogger(Java.class);
    public String code;

    public Java(String code) {
        this.code = code;
    }

    public Java(Java target) {
        super(target);
        if (target != null) {
            this.code = target.code;
        }
    }

    public Java() {
    }

    @Override
    public LanguageClone clone() {
        return new Java(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Java language) || !super.equals(object)) return false;
        return Objects.equals(language.code, code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void executeCode() {
        final String languageLevel = "medium";
        final String typeLanguage = "Interpreter";
        compile();
        logger(code);
        logger(languageLevel);
        logger(typeLanguage);
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
