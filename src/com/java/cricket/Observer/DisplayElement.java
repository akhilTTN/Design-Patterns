package com.java.cricket.Observer;

import com.java.cricket.Subject.Cricket;

public abstract class DisplayElement {
    protected Cricket cricket;
    public abstract void update();
}
