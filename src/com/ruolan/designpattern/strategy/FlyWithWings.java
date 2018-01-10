package com.ruolan.designpattern.strategy;

public class FlyWithWings implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("先飞行一下");
    }
}
