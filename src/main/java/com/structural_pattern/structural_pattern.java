package com.structural_pattern;


import com.structural_pattern.patterns.adapter.Adapter;
import com.structural_pattern.patterns.bridge.Bridge;
import com.structural_pattern.patterns.composite.Composite;
import com.structural_pattern.patterns.decorator.Decorator;
import com.structural_pattern.patterns.facade.Facade;
import com.structural_pattern.patterns.flyweight.FlyWeight;
import com.structural_pattern.patterns.proxy.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Los patrones estructurales explican cómo ensamblar objetos y clases en estructuras más grandes,
// a la vez que se mantiene la flexibilidad y eficiencia de estas estructuras
public class structural_pattern {
    static final Logger logger = LoggerFactory.getLogger(structural_pattern.class);

    public static void main(String[] args) {
        logger.info("\n \n ||| Adapter |||");
        Adapter.run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Bridge |||");
        new Bridge().makeBridgeTest();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Composite |||");
        new Composite().exec();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Decorator |||");
        new Decorator().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Facade |||");
        new Facade().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| FlyWeight |||");
        new FlyWeight().run();
        logger.info("\n \n \n");

        logger.info("\n \n ||| Proxy |||");
        new Proxy().run();
        logger.info("\n \n \n");
    }
}
