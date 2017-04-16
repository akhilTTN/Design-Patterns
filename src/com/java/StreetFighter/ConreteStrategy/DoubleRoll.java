package com.java.StreetFighter.ConreteStrategy;

import com.java.StreetFighter.Strategy.Roll;

public class DoubleRoll implements Roll {
    @Override
    public void roll() {
        System.out.println("Double Roll");
    }
}
