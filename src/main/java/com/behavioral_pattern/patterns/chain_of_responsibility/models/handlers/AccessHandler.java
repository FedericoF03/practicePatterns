package com.behavioral_pattern.patterns.chain_of_responsibility.models.handlers;

import com.behavioral_pattern.patterns.chain_of_responsibility.models.RequestUser;
//Interfaz del handler
public interface AccessHandler {
    void requestHandler(RequestUser user);
    void setNext(AccessHandler accessHandler);
}
