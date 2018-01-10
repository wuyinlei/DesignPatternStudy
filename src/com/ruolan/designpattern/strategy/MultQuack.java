package com.ruolan.designpattern.strategy;

public class MultQuack implements QuackBehavior {


    @Override
    public void quick() {
        System.out.println("什么都不做");
    }
}
