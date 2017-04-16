package com.java.cricket.ConcreteSubject;

import com.java.cricket.Subject.Cricket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData extends Cricket {
    private List<Integer> runs = new ArrayList<>();
    private Double runRate;
    private Integer bowls;

    public List<Integer> getRuns() {
        return runs;
    }

    public void setRuns(int run) {
        this.runs.add(run);
        setRunRate();
        super.notifyAllObservers();
    }

    public Double getRunRate() {
        return runRate;
    }

    private void setRunRate() {
        List<Integer> list = runs;
        Iterator iterator = list.iterator();
        Integer scoreSum = 0;
        while (iterator.hasNext()) {
            scoreSum = scoreSum + (Integer) iterator.next();
        }
        this.runRate = (double)scoreSum/(list.size());
    }

    public Integer getBowls() {
        return bowls;
    }

    public void setBowls(Integer bowls) {
        this.bowls = bowls;
    }
}
