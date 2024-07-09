package com.structural_pattern.patterns.adapter.adapters;

import com.structural_pattern.patterns.adapter.models.Java;
import com.structural_pattern.patterns.adapter.models.Js;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//El adapter que se extiende del tipo que queres adaptar
public class AdapterCodeTraductor extends Java {
    private final Js jsLanguage;
    private final Logger logger = LoggerFactory.getLogger(Java.class);

    public AdapterCodeTraductor(Js jsLanguage) {
        this.jsLanguage = jsLanguage;
    }

    @Override
    public void run() {
        logger.info("Desde adapter");
        jsLanguage.run();
    }
}
