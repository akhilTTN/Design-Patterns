package com.java.cricket.ConcreteObserver;

import com.java.cricket.Observer.DisplayElement;
import com.java.cricket.Subject.Cricket;
import com.java.cricket.ConcreteSubject.CricketData;

public class AverageScoreDisplay extends DisplayElement {
    @Override
    public void update() {
        System.out.println("<<<<<<<<<< Average Score >>>>>>>>>>");
        System.out.println("Run Rate: " + ((CricketData)cricket).getRunRate());
    }

    public AverageScoreDisplay(Cricket cricket) {
        this.cricket = cricket;
        this.cricket.attach(this);
    }
}
