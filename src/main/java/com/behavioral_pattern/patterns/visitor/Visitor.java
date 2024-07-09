package com.behavioral_pattern.patterns.visitor;

import com.behavioral_pattern.patterns.visitor.models.Police;
import com.behavioral_pattern.patterns.visitor.models.FireFighters;
import com.behavioral_pattern.patterns.visitor.models.AlarmDeforestation;

public class Visitor {
    public void run() {
        //Se crea la clase que queres incentarle algun metodo con su algoritmo por separado, evitando agregaciones masivas en una misma ruta
        //Se ejecuta el metodo accept que es uno en comun y se le inserta el visitor aquel encargado si queres de la logica o que mande a llamar
        // al de la logica.
        new FireFighters().accept(new AlarmDeforestation());
        new Police().accept(new AlarmDeforestation());
    }
}
