package com.structural_pattern.patterns.proxy;

import org.slf4j.LoggerFactory;
//Esta es la clase concreto o servicio al que proxy quiere acceder
public class ServerImpl implements Server {
    @Override
    public void accesCache() {
        LoggerFactory.getLogger(ServerImpl.class).info("Access server");
    }
}
