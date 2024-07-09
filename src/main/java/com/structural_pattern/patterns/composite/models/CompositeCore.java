package com.structural_pattern.patterns.composite.models;

import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
//Esta clase esta unida el composite con el contenedor, sin embargo se puede separar y solo ordenar que siga la logica de recorrido
//por separado, Composite solo se encarga de hacer recorrido, llamar a execute y que eso se ejecute en sus contenedores o hojas.
public class CompositeCore implements Core {
    protected List<Core> components;
    private final int core;

    public CompositeCore(List<Core> components, int core) {
        this.components = components;
        this.core = core;
    }

    public List<Core> getComponents() {
        return components;
    }

    public void setComponents(List<Core> components) {
        this.components = components;
    }

    public void add(Core component) {
        components.add(component);
    }

    public void remove(Core component) {
        components.remove(component);
    }

    public void removeAll(Core... component) {
        components.removeAll(Arrays.asList(component));
    }

    public void clear() {
        components.clear();
    }

    @Override
    public void exec() {
        for (Core component : components) {
            if (component instanceof CompositeCore) {
                LoggerFactory.getLogger(CompositeCore.class).info("Core: {}", core);
            }
            component.exec();
        }
    }


}
