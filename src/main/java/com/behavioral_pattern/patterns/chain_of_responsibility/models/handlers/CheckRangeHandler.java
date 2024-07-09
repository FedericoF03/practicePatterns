package com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers;

import com.behavioral_pattern.patterns.chain_of_responsibility.models.RequestUser;

public class CheckRangeHandler extends CommonBaseHandler {
    @Override
    public void requestHandler(RequestUser user) {
        if (user.isAdmin()) {
            logger.info("Check Admin");
            user.ImpMessage();
        } else {
            super.requestHandler(user);
        }
    }
}
