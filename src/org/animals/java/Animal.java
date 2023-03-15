package org.animals.java;

public abstract class Animal {
    //attributes
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //methods
    public abstract void call();

    public void sleep(){
        System.out.println("Zzzzz");
    };

    public void eat(String s){
        System.out.println(name + " is eating: " + s);
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
