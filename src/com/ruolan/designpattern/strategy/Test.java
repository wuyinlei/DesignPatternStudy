package com.ruolan.designpattern.strategy;

public class Test {

    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.display();


    }

}
