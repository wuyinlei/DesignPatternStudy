package com.ruolan.designpattern.factory.factory.chicago;

import com.ruolan.designpattern.factory.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("cheese  prepare");
    }

    @Override
    public void bake() {
        System.out.println("cheese  bake");
    }

    @Override
   public void cut() {
        System.out.println("cheese  cut");
    }

    @Override
    public void box() {
        System.out.println("cheese   box");
    }
}
