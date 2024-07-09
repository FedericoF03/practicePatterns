package com.creational_pattern.patterns.prototype.models.languages;

import com.creational_pattern.patterns.prototype.prototypes.LanguageClone;

import java.util.Objects;

public class Java23 extends Java {
    private Boolean templateString;

    public Java23(Boolean templateString) {
        this.templateString = templateString;
    }

    public Java23(Java23 target) {
        super(target);
        if (templateString != null) {
            this.templateString = target.templateString;
        }
    }

    public Boolean getTemplateString() {
        return templateString;
    }

    public void setTemplateString(Boolean templateString) {
        this.templateString = templateString;
    }

    @Override
    public LanguageClone clone() {

        return new Java23(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Java23 language) || !super.equals(object)) return false;
        return Objects.equals(language.code, code);
    }
}
