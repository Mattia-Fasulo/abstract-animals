package org.animals.java;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("Miao");
    }
}
