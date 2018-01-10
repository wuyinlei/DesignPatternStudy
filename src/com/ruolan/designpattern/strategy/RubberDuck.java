package com.ruolan.designpattern.strategy;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {


    @Override
    void display() {
        System.out.println("我是橡皮鸭");
        flyBehavior.fly();
        quackBehavior.quick();
    }

    @Override
    void performQuack() {

    }

    @Override
    void performFly() {

    }
}
