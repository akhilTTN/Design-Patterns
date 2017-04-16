package com.java.StreetFighter.Context;

import com.java.StreetFighter.Strategy.Jump;
import com.java.StreetFighter.Strategy.Roll;

public class Fighter {
    private Jump jump;
    private Roll roll;

    public Fighter(Jump jump, Roll roll) {
        this.jump = jump;
        this.roll = roll;
    }

    public void kick() {
        System.out.println("Kick");
    }

    public void punch() {
        System.out.println("Punch");
    }

    public void display() {
    }

    public void execute() {
        display();
        kick();
        punch();
        jump.jump();
        roll.roll();
    }

}
