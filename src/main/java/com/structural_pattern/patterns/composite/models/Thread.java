package com.structural_pattern.patterns.composite.models;

import org.slf4j.LoggerFactory;
//Hoja en este caso que simulo de forma simple un hilo.
public class Thread implements Core {
    private final int thread;

    public Thread(int thread) {
        this.thread = thread;
    }

    @Override
    public void exec() {
        LoggerFactory.getLogger(Thread.class).info("Thread: {}", thread);
    }
}
