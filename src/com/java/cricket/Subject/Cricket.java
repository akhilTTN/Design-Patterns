package com.java.cricket.Subject;

import com.java.cricket.Observer.DisplayElement;

import java.util.ArrayList;
import java.util.List;

public class Cricket {
    private List<DisplayElement> observers = new ArrayList<>();

    public void attach(DisplayElement observer) {
        observers.add(observer);
    }

    public void detach(DisplayElement observer) {
        observers.remove(observer);
    }

    protected void notifyAllObservers() {
        for (DisplayElement observer : observers) {
            observer.update();
        }
    }
}
