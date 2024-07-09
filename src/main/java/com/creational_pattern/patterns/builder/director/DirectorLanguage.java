package com.creational_pattern.patterns.builder.director;

import com.creational_pattern.patterns.builder.builders.BuilderLenguage;
import com.creational_pattern.patterns.builder.components.Debugger.DebuggerJava;
import com.creational_pattern.patterns.builder.components.Debugger.DebuggerJavaScript;
import com.creational_pattern.patterns.builder.components.code_traductor.Compiler;
import com.creational_pattern.patterns.builder.components.code_traductor.Interpreter;
import com.creational_pattern.patterns.builder.components.paradigm_type.Functional;
import com.creational_pattern.patterns.builder.components.paradigm_type.POO;
import com.creational_pattern.patterns.builder.models.languages.Language;

//El director es una clase para crear una plantilla con las configuraciones que queres,
//Se aplica el builder que dentro tiene el setter, por ultimo el makeLanguage
// crea el lenguage con el que tiene modificado el builder
public class DirectorLanguage {

    public Language makeJava(BuilderLenguage build) {
        return build.setParadigm(new POO())
                .setCode("Main.java")
                .setLenguageLevel("medium")
                .setTypeTraductorCode(new Compiler())
                .setDebugger(new DebuggerJava())
                .makeLanguage();

    }

    public Language makeJavascript(BuilderLenguage build) {
        return build.setParadigm(new Functional())
                .setCode("index.js")
                .setLenguageLevel("high")
                .setTypeTraductorCode(new Interpreter())
                .setDebugger(new DebuggerJavaScript())
                .makeLanguage();
    }
}
