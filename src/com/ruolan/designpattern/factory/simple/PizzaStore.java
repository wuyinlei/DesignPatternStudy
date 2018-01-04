package com.ruolan.designpattern.factory.simple;

public class PizzaStore {

    Pizza pizza;

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
    }

    public Pizza orderPizza(String type) {
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
