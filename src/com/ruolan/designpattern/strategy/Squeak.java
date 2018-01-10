package com.ruolan.designpattern.strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quick() {
        System.out.println("呱呱呱叫");
    }
}
