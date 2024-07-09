package com.behavioral_pattern.patterns.visitor.models;

//Interfaz de contrato de visitor que visita esas clases
public interface Visitor {
    void visit(Police police);

    void visit(FireFighters fireFighters);


}
