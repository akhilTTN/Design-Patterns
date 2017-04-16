package com.java.StreetFighter.ConcreteContext;

import com.java.StreetFighter.Context.Fighter;
import com.java.StreetFighter.Strategy.Jump;
import com.java.StreetFighter.Strategy.Roll;

public class Robin extends Fighter {
    public Robin(Jump jump, Roll roll) {
        super(jump, roll);
    }

    @Override
    public void kick() {
        super.kick();
    }

    @Override
    public void punch() {
        super.punch();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\n********** Robin **********");
    }
}
