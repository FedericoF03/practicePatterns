package com.creational_pattern.patterns.factory_Abstract.factory;

import com.creational_pattern.patterns.factory_Abstract.models.languages.Java;
import com.creational_pattern.patterns.factory_Abstract.models.languages.Language;
import com.creational_pattern.patterns.factory_Abstract.models.paradigm_type.POO;
import com.creational_pattern.patterns.factory_Abstract.models.paradigm_type.ParadigmType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryJavaLanguage implements FactoryLanguage {
    String code;
    Logger logger = LoggerFactory.getLogger(FactoryJavaLanguage.class);


    public FactoryJavaLanguage(String code) {
        this.code = code;
    }

    @Override
    public ParadigmType createParadigm() {
        return new POO();
    }

    @Override
    public Language createLanguage() {
        return new Java(code);
    }

    @Override
    public void createDebugger() {
        logger.info("create debugger Java");
    }

}
