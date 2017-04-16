package com.java.pizza.Decorator;

import com.java.pizza.Component.Pizza;

public abstract class PizzaDecorator implements Pizza{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public float getCost() {
        return pizza.getCost();
    }
}
