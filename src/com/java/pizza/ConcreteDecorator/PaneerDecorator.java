package com.java.pizza.ConcreteDecorator;

import com.java.pizza.Component.Pizza;
import com.java.pizza.Decorator.PizzaDecorator;

public class PaneerDecorator extends PizzaDecorator {
    public PaneerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getCost() {
        return super.getCost() + 100;
    }
}
