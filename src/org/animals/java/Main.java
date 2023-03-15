package org.animals.java;

public class Main {
    public static void main(String[] args) {

        Dog leopoldo = new Dog("Leopoldo");

        System.out.println(leopoldo);
        leopoldo.call();
        leopoldo.eat();
        leopoldo.sleep();
        System.out.println();

        Eagle franklin = new Eagle("Franklin");
        System.out.println(franklin);
        franklin.call();
        franklin.eat();
        franklin.sleep();

        System.out.println();

        Cat wagner = new Cat("Wagner");
        System.out.println(wagner);
        wagner.call();
        wagner.eat();
        wagner.sleep();

        System.out.println();

        Dolphin ugo = new Dolphin("Ugo");
        System.out.println(ugo);
        ugo.call();
        ugo.eat();
        ugo.sleep();

        System.out.println();

        makeSwim(leopoldo);

        makeSwim(wagner);

        makeSwim(ugo);

        makeFly(franklin);

    }

    public static void makeFly(Flyer flyer){
        flyer.fly();
    }

    public static void makeSwim(Swimmer swimmer){
        swimmer.swim();
    }
}
