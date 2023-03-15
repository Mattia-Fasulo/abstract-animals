package org.animals.java;

public class Dog extends Animal{
    //constructor
    public Dog(String name) {
        super(name);
    }

    //methods
    @Override
    public void call() {
        System.out.println("Bau bau");
    }

    @Override
    public String toString() {
        return "Dog {" + super.toString() + "}";
    }
}
