package com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers;


import com.behavioral_pattern.patterns.chain_of_responsibility.models.RequestUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckTokenHandler extends CommonBaseHandler {

    Logger logger = LoggerFactory.getLogger(CheckTokenHandler.class);

    @Override
    public void requestHandler(RequestUser user) {
        if (user.isAdmin()) {
            logger.info("Token checked Admin");
            super.requestHandler(user);
        } else if (user.isMod()) {
            logger.info("Token checked Moderator");
            super.requestHandler(user);
        } else if (user.isUser()) {
            logger.info("Token checked User");
            user.ImpMessage();
            super.requestHandler(user);
        } else {
            super.requestHandler(user);
        }
    }


}
