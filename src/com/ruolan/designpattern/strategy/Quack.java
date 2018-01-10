package com.ruolan.designpattern.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quick() {
        System.out.println("橡皮鸭的吱吱吱叫");
    }
}
