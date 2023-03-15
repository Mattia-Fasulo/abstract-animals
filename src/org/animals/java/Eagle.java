package org.animals.java;

public class Eagle extends Animal implements Flyer{
    //constructor
    public Eagle(String name) {
        super(name);
    }

    //methods
    @Override
    public void call() {
        System.out.println("kwak");
    }

    @Override
    public String toString() {
        return "Eagle {" + super.toString() + "}";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
