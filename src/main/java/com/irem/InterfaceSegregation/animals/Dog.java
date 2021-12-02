package com.irem.InterfaceSegregation.animals;

public class Dog implements Barkable,Runnable{
    public void bark() {
        System.out.println("Köpeğim,Havlıyorum.");
    }
    public void run() {
        System.out.println("Köpeğim,Koşuyorum.");
    }
}
