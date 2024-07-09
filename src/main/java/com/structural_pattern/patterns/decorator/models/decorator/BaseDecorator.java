package com.structural_pattern.patterns.decorator.models.decorator;

import com.structural_pattern.patterns.decorator.models.Language;

//El baseDecorator es el encargado de crear a traves de herencia diferentes situacion y cambios en un objeto segun como se apliquen.
public abstract class BaseDecorator implements Language {
    Language language;

    public BaseDecorator(Language language) {
        this.language = language;
    }


    @Override
    public void run() {
        language.run();
    }
}
