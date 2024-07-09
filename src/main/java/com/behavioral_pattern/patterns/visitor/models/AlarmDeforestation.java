package com.behavioral_pattern.patterns.visitor.models;

public class AlarmDeforestation implements Visitor {

    @Override
    public void visit(Police police) {
        police.response();
    }

    @Override
    public void visit(FireFighters fireFighters) {
        fireFighters.response();
    }
}
