package com.structural_pattern.patterns.decorator.models;

//Capa en comun que permite que todos ejecuten el metodo, esta es la interfaz de componente, bajo esta misma
// todas responden para generar la conexion entre clases
public interface Language {
    void run();
}
