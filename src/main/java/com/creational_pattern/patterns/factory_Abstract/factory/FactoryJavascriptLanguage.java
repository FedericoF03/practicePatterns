package com.creational_pattern.patterns.factory_Abstract.factory;

import com.creational_pattern.patterns.factory_Abstract.models.languages.JavaScript;
import com.creational_pattern.patterns.factory_Abstract.models.languages.Language;
import com.creational_pattern.patterns.factory_Abstract.models.paradigm_type.Functional;
import com.creational_pattern.patterns.factory_Abstract.models.paradigm_type.ParadigmType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryJavascriptLanguage implements FactoryLanguage {
    String code;
    Logger logger = LoggerFactory.getLogger(FactoryJavascriptLanguage.class);

    public FactoryJavascriptLanguage(String code) {
        this.code = code;
    }

    @Override
    public ParadigmType createParadigm() {
        return new Functional();
    }

    @Override
    public Language createLanguage() {
        return new JavaScript(code);
    }

    @Override
    public void createDebugger() {
        logger.info("Create Debugger Js");
    }


}
