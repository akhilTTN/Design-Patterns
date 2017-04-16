package com.java.cricket.ConcreteObserver;

import com.java.cricket.Observer.DisplayElement;
import com.java.cricket.Subject.Cricket;
import com.java.cricket.ConcreteSubject.CricketData;

import java.util.List;

public class CurrentScoreDisplay extends DisplayElement {
    @Override
    public void update() {
        System.out.println("<<<<<<<<<< Current Score >>>>>>>>>>");
        List<Integer> list = ((CricketData)cricket).getRuns();
        System.out.println("Runs: "+ list.get(list.size() - 1));
        System.out.println("Bowls: " + ((CricketData)cricket).getBowls());
    }

    public CurrentScoreDisplay(Cricket cricket) {
        this.cricket = cricket;
        this.cricket.attach(this);
    }
}
