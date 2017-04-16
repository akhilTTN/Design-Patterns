package com.java.StreetFighter.ConreteStrategy;

import com.java.StreetFighter.Strategy.Roll;

public class SingleRoll implements Roll {
    @Override
    public void roll() {
        System.out.println("Single Roll");
    }
}
