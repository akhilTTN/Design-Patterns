package com.java.pizza.ConcreteComponent;

import com.java.pizza.Component.Pizza;

public class PeppyPaneer implements Pizza {

    @Override
    public float getCost() {
        return 500;
    }
}
