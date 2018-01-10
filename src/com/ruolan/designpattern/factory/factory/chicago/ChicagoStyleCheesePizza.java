package com.ruolan.designpattern.factory.factory.chicago;

import com.ruolan.designpattern.factory.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated ChicagoStyle Cheese");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("cheese  prepare");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("cheese  bake");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("cheese  cut");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("cheese   box");
    }
}
