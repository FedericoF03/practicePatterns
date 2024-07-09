package com.structural_pattern.patterns.flyweight.models;


//El contexto es el conecta todo tiene su algoritmo que pasa los datos extrinsecos para ejecutar al flyweight pero antes de eso
//verifica si ya existe alguno en la factoria que seria la cache.
public class LoaderChunksContext {
    FlyweightChunk flyweightChunk;
    boolean animals;
    boolean disaster;
    String nameChunk;

    public LoaderChunksContext(boolean animals, boolean disaster, String nameChunk,
                               boolean chunkLoad, boolean trees, boolean grass) {
        this.flyweightChunk = FlyWeightFactoryChunks.getCache(chunkLoad, trees, grass);
        this.animals = animals;
        this.disaster = disaster;
        this.nameChunk = nameChunk;
    }

    public void drawChunks() {
        flyweightChunk.drawChunk(this.animals, this.disaster, this.nameChunk);
    }


}
