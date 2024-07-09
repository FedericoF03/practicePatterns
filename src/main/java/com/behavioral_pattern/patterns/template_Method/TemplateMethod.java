package com.behavioral_pattern.patterns.template_Method;

import com.behavioral_pattern.patterns.template_Method.models.SensorTemp;
import com.behavioral_pattern.patterns.template_Method.models.SensorWeather;

public class TemplateMethod {
    public void run() {
        //Creamos las clases que van a tener su algoritmo interno que elige como se va a ejecutar,
        //sin embargo el padre de estas cual heredan todos sus metodos se encargan de la logica exceptuando los pasos remplazados
        SensorTemp sensorTemp = new SensorTemp();
        SensorWeather sensorWeather = new SensorWeather();

        //Se testea
        sensorTemp.setaBoolean(true);
        sensorTemp.templateMethod();

        //Se testea
        sensorWeather.setaBoolean(false);
        sensorWeather.templateMethod();
    }
}
