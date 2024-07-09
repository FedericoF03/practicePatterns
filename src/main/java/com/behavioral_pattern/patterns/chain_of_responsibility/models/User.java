package com.behavioral_pattern.patterns.chain_of_responsibility.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User implements IUser {
    Logger logger = LoggerFactory.getLogger(User.class);
    private final String range = "User";

    @Override
    public void userAccess() {
        logger.info("Is {}", range);
    }

    @Override
    public String getRange() {
        return range;
    }
}
