package com.irem.InterfaceSegregation.animals;

public class Bird implements Flyable,Runnable {
    public void run() {
        System.out.println("Kuşum,Koşuyorum");
    }
    public void fly() {
        System.out.println("Kuşum, Uçuyorum.");
    }

}
