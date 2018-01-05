package com.ruolan.designpattern.factory.factory;

public class Test {

    public static void main(String []args){

        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

    }

}
