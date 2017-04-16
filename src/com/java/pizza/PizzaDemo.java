package com.java.pizza;

import com.java.pizza.Component.Pizza;
import com.java.pizza.ConcreteComponent.Farmhouse;
import com.java.pizza.ConcreteComponent.Margherita;
import com.java.pizza.ConcreteComponent.PeppyPaneer;
import com.java.pizza.ConcreteDecorator.CapsicumDecorator;
import com.java.pizza.ConcreteDecorator.JalapenoDecorator;
import com.java.pizza.ConcreteDecorator.PaneerDecorator;
import com.java.pizza.Decorator.PizzaDecorator;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        /*PeppyPaneer peppyPaneer = new PeppyPaneer();
        Pizza jalapenoPizza = new JalapenoDecorator(new PaneerDecorator(peppyPaneer));
        System.out.println(jalapenoPizza.getCost());*/

        Scanner scanner = new Scanner(System.in);
        int choice, toppingChoice;
        char option;
        String ch;
        Pizza pizza = null;
        PizzaDecorator pizzaDecorator = null;
        float cost = 0;

        do {
            System.out.println();
            System.out.println("********** PIZZA MENU **********");
            System.out.println("1. Farmhouse");
            System.out.println("2. Margherita");
            System.out.println("3. PeppyPaneer");
            System.out.print("\nSelect your pizza from above: ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) {
                switch (choice) {
                    case 1:
                        pizza = new Farmhouse();
                        break;
                    case 2:
                        pizza = new Margherita();
                        break;
                    case 3:
                        pizza = new PeppyPaneer();
                        break;
                    default:
                        System.out.println("Please enter correct choice");
                        break;
                }

                System.out.println();
                System.out.println("<<<<<<<<<< Topping Menu >>>>>>>>>>");
                System.out.println("1. Capsicum");
                System.out.println("2. Jalapeno");
                System.out.println("3. Paneer");

                System.out.print("\nDo you want to add some topping? if YES enter (Y) else (N): ");
                ch = scanner.next();
                ch = ch.toUpperCase();
                option = ch.charAt(0);
                while (option == 'Y') {
                    System.out.print("Enter your selected topping one by one: ");
                    toppingChoice = scanner.nextInt();

                    switch (toppingChoice) {
                        case 1:
                            pizzaDecorator = new CapsicumDecorator(pizza);
                            break;
                        case 2:
                            pizzaDecorator = new JalapenoDecorator(pizza);
                            break;
                        case 3:
                            pizzaDecorator = new PaneerDecorator(pizza);
                            break;
                        default:
                            System.out.println("Please enter correct choice");
                            break;
                    }
                    pizza = pizzaDecorator;
                    System.out.print("\nDo you want to add some more topping? if YES enter (Y) else (N): ");
                    ch = scanner.next();
                    ch = ch.toUpperCase();
                    option = ch.charAt(0);
                }

                cost = cost + pizza.getCost();
                System.out.println("Total Cost is " + cost);
            }
            System.out.print("\nDo you want to select more Pizza? if YES enter (Y) else (N): ");
            ch = scanner.next();
            ch = ch.toUpperCase();
            option = ch.charAt(0);
        } while (option == 'Y');
        System.out.println("\n Thank You");
    }
}
