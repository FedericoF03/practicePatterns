package com.structural_pattern.patterns.decorator.models.decorator;

import com.structural_pattern.patterns.decorator.models.Language;
import org.slf4j.LoggerFactory;

public class CodeTraductorDecorator extends BaseDecorator {

    public CodeTraductorDecorator(Language language) {
        super(language);
    }

    private void extra() {
        LoggerFactory.getLogger(DebuggerDecorator.class).info("codeTraductor run");
    }

    @Override
    public void run() {
        extra();
        super.run();
        

    }


}
