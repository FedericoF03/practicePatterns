package com.structural_pattern.patterns.bridge.models.SO;

import com.structural_pattern.patterns.bridge.models.Languages.Language;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Linux implements SO {
    final Logger logger = LoggerFactory.getLogger(Linux.class);
    protected Language language;

    public Linux(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public SO runSO() {
        logger.info("Run Linux");
        return this;
    }

    @Override
    public SO runLanguage() {
        language.run();
        return this;
    }


    @Override
    public SO stopSO() {
        logger.info("stop Linux");
        return this;
    }
}
