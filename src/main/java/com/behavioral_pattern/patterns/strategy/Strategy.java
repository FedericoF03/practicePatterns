package com.behavioral_pattern.patterns.strategy;

import com.behavioral_pattern.patterns.strategy.models.Exe;
import com.behavioral_pattern.patterns.strategy.models.ContextExecute;
import com.behavioral_pattern.patterns.strategy.models.Hardware;
import com.behavioral_pattern.patterns.strategy.models.Web;

public class Strategy {

    public void run() {
        //Declaramos las estrategias y despues el contexto que va aplicandolas y cambiandolas
        Exe exe = new Exe();
        Web web = new Web();
        Hardware hardware = new Hardware();
        ContextExecute contextExecute = new ContextExecute();

        //Primer estrategia
        contextExecute.setStrategy(exe);
        contextExecute.doSomething(1);

        //Segunda estrategia
        contextExecute.setStrategy(web);
        contextExecute.doSomething(2);

        //Tercera estrategia
        contextExecute.setStrategy(hardware);
        contextExecute.doSomething(3);


    }
}
