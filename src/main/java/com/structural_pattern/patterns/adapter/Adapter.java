package com.structural_pattern.patterns.adapter;

import com.structural_pattern.patterns.adapter.adapters.AdapterCodeTraductor;
import com.structural_pattern.patterns.adapter.models.Compiler;
import com.structural_pattern.patterns.adapter.models.Java;
import com.structural_pattern.patterns.adapter.models.Js;

public final class Adapter {
    static public void run() {
        // El patron de diseño estructural Adapter, se crea una adaptacion de un codigo incompatible con el otro
        //lo que hace es crear una clase Adapter que se extiende de la clase que se busca tener la compatibilidad para poder
        //usarlo.

        //La linea comentada tira error porque el tipo esperado de compiler es java no Js, sin embargo con el adaptador
        //logramos transformar js en un lenguaje compilable y lo compilamos, haciendo que funcione.
        //Gracias a esta forma podemos asegurarnos que va a funcionar porque la abstracion hace el puente con la implementacion
        // esto entre interfaces o una clase abstracta, esos metodos no van a mutar nunca porque son contrato.
        final Compiler compiler = new Compiler(new Java());
        final Compiler compiler1 = new Compiler(new AdapterCodeTraductor(new Js()));
//        final Compiler compiler2 = new Compiler(new Js());
        compiler.run();
        compiler1.run();
//        compiler2.run();
    }

}
