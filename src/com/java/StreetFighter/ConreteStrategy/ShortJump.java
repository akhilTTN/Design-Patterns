package com.java.StreetFighter.ConreteStrategy;

import com.java.StreetFighter.Strategy.Jump;

public class ShortJump implements Jump {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
