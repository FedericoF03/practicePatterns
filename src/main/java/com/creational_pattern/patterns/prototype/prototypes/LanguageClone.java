package com.creational_pattern.patterns.prototype.prototypes;

import com.creational_pattern.patterns.prototype.models.languages.Java;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public abstract class LanguageClone implements IPrototype {
    private static final Logger logger = LoggerFactory.getLogger(Java.class);
    private String nameLanguage;
    private String leveLanguage;
    private String typeLanguage;
    public String code;

    public LanguageClone() {
    }


    public LanguageClone(LanguageClone target) {
        if (target != null) {
            this.code = target.code;
            this.leveLanguage = target.leveLanguage;
            this.typeLanguage = target.typeLanguage;
            this.nameLanguage = target.nameLanguage;
        }

    }

    @Override
    public abstract LanguageClone clone();


    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof LanguageClone languageClone2)) return false;
        return Objects.equals(languageClone2.code, code) &&
                Objects.equals(languageClone2.leveLanguage, leveLanguage) &&
                Objects.equals(languageClone2.typeLanguage, typeLanguage) &&
                Objects.equals(languageClone2.nameLanguage, nameLanguage);
    }

    public void executeCode() {

    }


    public void manageStack() {

    }


    public void manageGarbageCollector() {
        logger("clean");
    }


    public void stopCode() {
        logger("stop code");
    }


    public void returnError() {
        stopCode();
        throw new IllegalArgumentException("Error in the line:");
    }


    public void logger(String code) {
        logger.info(code);
    }


}
