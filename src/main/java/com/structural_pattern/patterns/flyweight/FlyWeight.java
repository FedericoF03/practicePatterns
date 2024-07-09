package com.structural_pattern.patterns.flyweight;

import com.structural_pattern.patterns.flyweight.models.LoaderChunksContext;

public class FlyWeight {
    public void run() {
        //Invocamos el context que es el que pasa todos los datos tanto los intrinsecos como extrinsecos, sin embargo dentro tiene la logica
        //Que gestiona eso con la factory
        LoaderChunksContext loaderChunksContext = new LoaderChunksContext(true, false, "#4546", true, true, true);
        LoaderChunksContext loaderChunksContext2 = new LoaderChunksContext(true, false, "#4556", true, true, true);
        LoaderChunksContext loaderChunksContext3 = new LoaderChunksContext(true, false, "#4526", false, true, true);

        //Llamamos al metodo que ejecuta el algoritmo.
        loaderChunksContext.drawChunks();
        loaderChunksContext2.drawChunks();
        loaderChunksContext3.drawChunks();
    }
}
