package com.creational_pattern.patterns.builder.builders;

import com.creational_pattern.patterns.builder.components.Debugger.Debugger;
import com.creational_pattern.patterns.builder.components.code_traductor.CodeTraductor;
import com.creational_pattern.patterns.builder.components.paradigm_type.ParadigmType;
import com.creational_pattern.patterns.builder.models.languages.JavaScript;
import com.creational_pattern.patterns.builder.models.languages.Language;

public class BuilderJavascript implements BuilderLenguage {
    private String lenguageLevel;
    private CodeTraductor typeTraductorCode;
    private String code;
    private Debugger debugger;
    private ParadigmType paradigmType;

    @Override
    public BuilderLenguage setLenguageLevel(String lenguageLevel) {
        this.lenguageLevel = lenguageLevel;
        return this;
    }

    @Override
    public BuilderLenguage setTypeTraductorCode(CodeTraductor typeTraductorCode) {
        this.typeTraductorCode = typeTraductorCode;
        return this;
    }

    @Override
    public BuilderLenguage setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public BuilderLenguage setParadigmType(ParadigmType paradigmType) {
        this.paradigmType = paradigmType;
        return this;
    }

    @Override
    public BuilderLenguage setParadigm(ParadigmType paradigmType) {
        this.paradigmType = paradigmType;
        return this;
    }


    @Override
    public BuilderLenguage setDebugger(Debugger debugger) {
        this.debugger = debugger;
        return this;
    }

    @Override
    public Language makeLanguage() {
        return new JavaScript(lenguageLevel, typeTraductorCode, code, debugger, paradigmType);
    }
}
