package com.creational_pattern.patterns.factory_Abstract.factory;

import com.creational_pattern.patterns.factory_Abstract.models.languages.Language;
import com.creational_pattern.patterns.factory_Abstract.models.paradigm_type.ParadigmType;

//La interfaz que siguen todas las factorias clasificadas
// en una categoria donde se maneja los metodos de las que compartan caracteristicas.
public interface FactoryLanguage {

    ParadigmType createParadigm();

    Language createLanguage();

    void createDebugger();


}
