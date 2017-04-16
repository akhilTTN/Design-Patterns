package com.java.pizza.ConcreteComponent;

import com.java.pizza.Component.Pizza;

public class Margherita implements Pizza {
    @Override
    public float getCost() {
        return 400;
    }
}
