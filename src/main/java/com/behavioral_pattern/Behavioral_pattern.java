package com.behavioral_pattern;


import com.behavioral_pattern.patterns.chain_of_responsibility.ChainOfResponsibility;
import com.behavioral_pattern.patterns.command.Command;
import com.behavioral_pattern.patterns.iterator.Iterator;
import com.behavioral_pattern.patterns.mediator.Mediator;
import com.behavioral_pattern.patterns.memento.Memento;
import com.behavioral_pattern.patterns.observer.Observer;
import com.behavioral_pattern.patterns.state.State;
import com.behavioral_pattern.patterns.strategy.Strategy;
import com.behavioral_pattern.patterns.template_Method.TemplateMethod;
import com.behavioral_pattern.patterns.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

//Los patrones de comportamiento tratan con algoritmos y la asignación de responsabilidades entre objetos.
public class Behavioral_pattern {
    static Logger logger = LoggerFactory.getLogger(Behavioral_pattern.class);

    public static void main(String[] args) {
        logger.info("\n \n ||| Chain of responsibility |||");
        new ChainOfResponsibility().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Command |||");
        new Command().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Iterator |||");
        new Iterator().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Mediator |||");
        new Mediator().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Memento |||");
        new Memento().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Observer |||");
        new Observer().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| State |||");
        new State().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Strategy |||");
        new Strategy().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Template Method |||");
        new TemplateMethod().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Visitor |||");
        new Visitor().run();
        logger.info("\n \n \n");
    }
}
