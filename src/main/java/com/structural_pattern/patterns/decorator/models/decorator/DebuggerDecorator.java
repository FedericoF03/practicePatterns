package com.structural_pattern.patterns.decorator.models.decorator;

import com.structural_pattern.patterns.decorator.models.Language;
import org.slf4j.LoggerFactory;

public class DebuggerDecorator extends BaseDecorator {
    public DebuggerDecorator(Language language) {
        super(language);
    }

    private void extra() {
        LoggerFactory.getLogger(DebuggerDecorator.class).info("Debugger run");
    }

    @Override
    public void run() {
        extra();
        super.run();
        
    }
}
