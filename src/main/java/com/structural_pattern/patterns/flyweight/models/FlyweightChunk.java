package com.structural_pattern.patterns.flyweight.models;

import org.slf4j.LoggerFactory;


//Aca se almacena el algoritmo que queremos ejercer y los datos intrinsecos
public class FlyweightChunk {
    boolean chunkLoad;
    boolean trees;
    boolean grass;

    public FlyweightChunk(boolean chunkLoad, boolean trees, boolean grass) {
        this.chunkLoad = chunkLoad;
        this.trees = trees;
        this.grass = grass;
    }

    void drawChunk(boolean animals, boolean disaster, String nameChunk) {
        LoggerFactory.getLogger(FlyweightChunk.class).info("{}, {}, {}, {}, {}, {}", animals, disaster, nameChunk, chunkLoad, trees, grass);
    }
}
