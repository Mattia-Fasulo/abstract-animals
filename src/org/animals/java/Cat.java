package org.animals.java;

public class Cat extends Animal{
    //constructor
    public Cat(String name) {
        super(name);
    }

    //methods
    @Override
    public void call() {
        System.out.println("Miao");
    }

    @Override
    public String toString() {
        return "Cat {" + super.toString() + "}";
    }
}
