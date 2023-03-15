package org.animals.java;

public class Cat extends Animal implements Swimmer{
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

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
