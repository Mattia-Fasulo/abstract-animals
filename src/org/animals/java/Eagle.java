package org.animals.java;

public class Eagle extends Animal{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("kwak");
    }
}
