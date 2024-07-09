package com.creational_pattern.patterns.singleton.models;

public final class SO {
    private static SO instance;
    public String value;

    private SO(String value) {
        this.value = value;
    }

    public static SO getInstance(String value) {
        if (instance == null) {
            instance = new SO(value);
        }
        return instance;
    }
}
