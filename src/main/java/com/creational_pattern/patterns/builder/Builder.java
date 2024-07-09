package com.creational_pattern.patterns.builder;

import com.creational_pattern.patterns.builder.builders.BuilderJava;
import com.creational_pattern.patterns.builder.builders.BuilderJavascript;
import com.creational_pattern.patterns.builder.director.DirectorLanguage;
//El builder dentro tiene componentes
public class Builder {
    public void invoke() {
        //Se invoca el director, el metodo con el builder del lenguaje
        new DirectorLanguage().makeJava(new BuilderJava()).executeCode();
        new DirectorLanguage().makeJavascript(new BuilderJavascript()).executeCode();
    }
}
