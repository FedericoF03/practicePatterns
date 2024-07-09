package com.structural_pattern.patterns.flyweight.models;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


//La factory es la encargada de almacenar en su cache todos los elementos y evitar crearlos innecesariamente cuando son iguales
public class FlyWeightFactoryChunks {
    private static final List<FlyweightChunk> cache = new ArrayList<>();

    public static FlyweightChunk getCache(boolean chunkLoad, boolean trees, boolean grass) {

        for (FlyweightChunk chunk : cache) {
            if (chunk.chunkLoad == chunkLoad && chunk.trees == trees && chunk.grass == grass) {
                LoggerFactory.getLogger(FlyWeightFactoryChunks.class).info(chunk.getClass().toString());
                LoggerFactory.getLogger(FlyWeightFactoryChunks.class).info("exist");
                return chunk;
            }
        }
        LoggerFactory.getLogger(FlyWeightFactoryChunks.class).info("add");
        FlyweightChunk chunk = new FlyweightChunk(chunkLoad, trees, grass);
        cache.add(chunk);
        return chunk;
    }
}
