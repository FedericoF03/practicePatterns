package com.behavioral_pattern.patterns.template_Method.models;

import org.slf4j.LoggerFactory;

//Clase abstracta de template method que se encarga de armar la misma peticion de diferentes formas y que sus hijas cambian el comprotamiento.
public abstract class SensorAbstract {
    boolean aBoolean;

    public void templateMethod() {
        step1();
        if (step2(aBoolean)) {
            step3();
        } else {
            step4();
        }
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void step1() {
        LoggerFactory.getLogger(SensorAbstract.class).info("run sensor");
    }

    public boolean step2(boolean bol) {
        LoggerFactory.getLogger(SensorAbstract.class).info("check boolean");
        return bol;
    }

    public void step3() {
        LoggerFactory.getLogger(SensorAbstract.class).info("replace");
    }

    public void step4() {
        LoggerFactory.getLogger(SensorAbstract.class).info("error");
    }


}
