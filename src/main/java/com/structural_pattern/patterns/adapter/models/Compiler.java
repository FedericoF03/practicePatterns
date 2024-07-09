package com.structural_pattern.patterns.adapter.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compiler {
    Logger logger = LoggerFactory.getLogger(Compiler.class);
    Java language;

    public Compiler(Java language) {
        this.language = language;
    }

    public Java getLanguage() {
        return language;
    }

    public void setLanguage(Java language) {
        this.language = language;
    }

    public void run() {
        language.run();
        logger.info(language.toString());
    }
}
