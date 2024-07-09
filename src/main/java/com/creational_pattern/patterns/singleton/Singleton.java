package com.creational_pattern.patterns.singleton;

import com.creational_pattern.patterns.singleton.models.SO;

public class Singleton {

    public static SO getInstance(String SOName) {
        return SO.getInstance(SOName);
    }
}
