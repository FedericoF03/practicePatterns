package com.structural_pattern.patterns.adapter.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Js {
    private final Logger logger = LoggerFactory.getLogger(Java.class);

    public void run() {
        logger.info("Desde Js");
    }
}
