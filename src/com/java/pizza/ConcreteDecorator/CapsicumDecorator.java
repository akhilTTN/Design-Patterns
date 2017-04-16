package com.java.pizza.ConcreteDecorator;

import com.java.pizza.Component.Pizza;
import com.java.pizza.Decorator.PizzaDecorator;

public class CapsicumDecorator extends PizzaDecorator {
    public CapsicumDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getCost() {
        return super.getCost() + 100;
    }
}
