package com.java.StreetFighter.ConreteStrategy;

import com.java.StreetFighter.Strategy.Jump;

public class LongJump implements Jump {
    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
