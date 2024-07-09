package com.creational_pattern.patterns.builder.builders;

import com.creational_pattern.patterns.builder.components.Debugger.Debugger;
import com.creational_pattern.patterns.builder.components.code_traductor.CodeTraductor;
import com.creational_pattern.patterns.builder.components.paradigm_type.ParadigmType;
import com.creational_pattern.patterns.builder.models.languages.Language;

//Builder plantilla, estos metodos van a estar en todos
public interface BuilderLenguage {
    BuilderLenguage setParadigm(ParadigmType paradigmType);

    BuilderLenguage setDebugger(Debugger debugger);

    Language makeLanguage();

    BuilderLenguage setLenguageLevel(String lenguageLevel);

    BuilderLenguage setTypeTraductorCode(CodeTraductor typeTraductorCode);

    BuilderLenguage setCode(String code);

    BuilderLenguage setParadigmType(ParadigmType paradigmType);
}
