package com.behavioral_pattern.patterns.template_Method.models;

import org.slf4j.LoggerFactory;

public class SensorTemp extends SensorAbstract {

    @Override
    public void step3() {
        LoggerFactory.getLogger(SensorTemp.class).info("See temp");
    }
}
