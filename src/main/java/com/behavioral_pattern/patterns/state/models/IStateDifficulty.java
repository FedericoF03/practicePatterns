package com.behavioral_pattern.patterns.state.models;

//Interfaz que funciona como contrato, esto es lo que va a ejecutar el contexto y lo que va a tener por predeterminado los estados
public interface IStateDifficulty {
    void doThis();

    void doThat();

    void setContext(GameContext gameContext);
}
