package org.animals.java;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("Bau bau");
    }
}
