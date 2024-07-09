package com.structural_pattern.patterns.proxy;

import org.slf4j.LoggerFactory;


//El proxy en cuestion.
public class ServerCache implements Server {
    private final Server server;

    public ServerCache(Server server) {
        this.server = server;
    }

    @Override
    public void accesCache() {
        LoggerFactory.getLogger(ServerCache.class).info("Server cache");
        server.accesCache();
    }
}
