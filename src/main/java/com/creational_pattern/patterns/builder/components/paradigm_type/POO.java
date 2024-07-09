package com.creational_pattern.patterns.builder.components.paradigm_type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class POO implements ParadigmType {
    Logger logger = LoggerFactory.getLogger(POO.class);

    @Override
    public void selectParadigmType() {
        insert();
    }

    public void insert() {
        logger.info("se inserto el paradigma POO como enfoque");
    }
}
