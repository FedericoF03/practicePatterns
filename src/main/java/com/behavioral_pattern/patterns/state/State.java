package com.behavioral_pattern.patterns.state;

import com.behavioral_pattern.patterns.state.models.states.Easy;
import com.behavioral_pattern.patterns.state.models.GameContext;
import com.behavioral_pattern.patterns.state.models.states.Hard;
import com.behavioral_pattern.patterns.state.models.states.Medium;
import com.behavioral_pattern.patterns.state.models.states.NotValid;

public class State {
    public void run() {
        //Estado inicial con el contexto
        Easy initialState = new Easy();
        GameContext gameContext = new GameContext(initialState);


        //Se ejecuta desde el contexto lo del estado
        gameContext.doThat();
        gameContext.doThis();

        //Se settea otro contexto y se procede a ejecutar
        gameContext.setState(new Medium());

        gameContext.doThat();
        gameContext.doThis();

        //repetimos la formula
        gameContext.setState(new Hard());

        gameContext.doThat();
        gameContext.doThis();


        //La repetimos nuevamente pero esta ves esta clase apropocito tiene una logica interna que
        // devuelve un nuevo estado porque ese mismo no sirve, entonces se ejecuta dos veces doThis, la segunda ya es desde la vista
        //de este estado que cambio
        gameContext.setState(new NotValid());

        gameContext.doThis();

        gameContext.doThis();
        gameContext.doThat();

    }
}
