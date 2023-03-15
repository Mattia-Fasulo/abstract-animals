package org.animals.java;

public class Dog extends Animal implements Swimmer{
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

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
