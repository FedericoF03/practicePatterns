package com.structural_pattern.patterns.composite;

import com.structural_pattern.patterns.composite.models.CompositeCore;
import com.structural_pattern.patterns.composite.models.Thread;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

//El patron de diseño estructural composite busca hacer mas dinamico el recorrido y ejecucion de proceso en modelo arbol binario.
public class Composite {
    public void exec() {
        //Declaramos los dos tipos de clases que van a ser parte de de nuestro arbol,
        //Thread hace de "Hoja" asi se le llama a los nodos en un algoritmo de arbol binario donde no tiene conexion a otros
        // Composite hace de la clase que puede recorrer otras, en este caso se uso como union al Composite con la clase core creando
        // CompositeCore (Core no es nada mas que el nombre que elegi para crear la clase que almacena otras)
        // Se agrega esta misma en forma de ramas, agregando CompositeCore y metiendo los hilos y el otro compositeCore
        // Debido a ello se puede ejecutar con el meto en comun que tienen para compartir en el recorrido una actualizacion o lo que quieras hacer
        // DISCLAIMER: El como lo encadenes puede llegar a un bucle INFINITO, debido a eso se satura la memoria frenando el programa.
        CompositeCore managerComposite = new CompositeCore(new ArrayList<>(), 1);
        CompositeCore managerComposite2 = new CompositeCore(new ArrayList<>(), 2);

        Thread thread1 = new Thread(1);
        Thread thread2 = new Thread(2);
        managerComposite.add(thread1);
        managerComposite.add(managerComposite2);
        managerComposite2.add(thread1);
        managerComposite2.add(thread2);
        managerComposite.exec();
        LoggerFactory.getLogger(Composite.class).info(managerComposite.getComponents().toString());
        LoggerFactory.getLogger(Composite.class).info(managerComposite2.getComponents().toString());


    }
}
