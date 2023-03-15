package org.animals.java;

public class Dolphin extends  Animal{

    //constructor
    public Dolphin(String name) {
        super(name);
    }

    //methods
    @Override
    public void call() {
        System.out.println("Trill");
    }

    @Override
    public String toString() {
        return "Dolphin {" + super.toString() + "}";
    }
}
