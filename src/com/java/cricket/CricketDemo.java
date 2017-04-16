package com.java.cricket;

import com.java.cricket.ConcreteObserver.AverageScoreDisplay;
import com.java.cricket.ConcreteObserver.CurrentScoreDisplay;
import com.java.cricket.ConcreteSubject.CricketData;

import java.util.Scanner;

public class CricketDemo {
    public static void main(String[] args) {
        char option = 'Y';
        String ch;
        Scanner scanner = new Scanner(System.in);
        int score;
        int countBowls = 0;

        CricketData cricket = new CricketData();
        new CurrentScoreDisplay(cricket);
        new AverageScoreDisplay(cricket);

        while (option == 'Y') {
            System.out.print("Enter cricket score: ");
            score = scanner.nextInt();

            cricket.setBowls(++countBowls);
            cricket.setRuns(score);

            System.out.print("\nDo you want to add score? if YES enter (Y) else (N): ");
            ch = scanner.next();
            ch = ch.toUpperCase();
            option = ch.charAt(0);
        }

    }
}
