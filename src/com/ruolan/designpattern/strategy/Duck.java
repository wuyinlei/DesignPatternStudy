package com.ruolan.designpattern.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    void swim(){}

    abstract void display();

    abstract void performQuack();

    abstract void performFly();

    //鸭子的其他行为


}
