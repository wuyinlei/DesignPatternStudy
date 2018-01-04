package com.ruolan.designpattern.factory.simple;

public class CheesePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("cheese  prepare");
    }

    @Override
    void bake() {
        System.out.println("cheese  bake");
    }

    @Override
    void cut() {
        System.out.println("cheese  cut");
    }

    @Override
    void box() {
        System.out.println("cheese   box");
    }
}
