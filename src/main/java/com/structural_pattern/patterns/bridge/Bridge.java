package com.structural_pattern.patterns.bridge;

import com.structural_pattern.patterns.bridge.models.Languages.Java;
import com.structural_pattern.patterns.bridge.models.Languages.Javascript;
import com.structural_pattern.patterns.bridge.models.SO.Linux;
import com.structural_pattern.patterns.bridge.models.SO.SO;
import com.structural_pattern.patterns.bridge.models.SO.Windows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//Este patron de diseño estructural Bridge, se trata de separar la abstraccion de la implementacion
public final class Bridge {
    final Logger logger = LoggerFactory.getLogger(Bridge.class);
    private SO system;

    public Bridge() {
        this.system = new Linux(new Java());
    }

    public SO getSystem() {
        return system;
    }

    public void setSystem(SO system) {
        this.system = system;
    }

    public void makeBridgeTest() {

        //Tenemos las clases de la abstraccion, estas solo pueden funcionar como las que invocan la ejecuccion, de esta manera
        //separamos lo que dice que debe hacer y que Clase se lo dice asi que puede cambiarse, se instancia la abstraccion y dentro de la misma
        //Lo que queres controlar, es muy comun para el uso cuando no sabes si es el uso definitivo o va a tener mas de uno.
        system.runSO().runLanguage().stopSO();
        logger.info("\n \n \n");

        setSystem(new Linux(new Javascript()));
        system.runSO().runLanguage().stopSO();
        logger.info("\n \n \n");


        setSystem(new Windows(new Javascript()));
        system.runSO().runLanguage().stopSO();
        logger.info("\n \n \n");


        setSystem(new Windows(new Java()));
        system.runSO().runLanguage().stopSO();
        logger.info("\n \n \n");

    }
}
