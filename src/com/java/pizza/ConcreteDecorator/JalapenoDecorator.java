package com.java.pizza.ConcreteDecorator;

import com.java.pizza.Component.Pizza;
import com.java.pizza.Decorator.PizzaDecorator;

public class JalapenoDecorator extends PizzaDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getCost() {
        return super.getCost() + 100;
    }
}
