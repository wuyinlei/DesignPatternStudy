package com.ruolan.designpattern.factory.factory;

public class Test {

    public static void main(String []args){

        PizzaStore nystyleStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = nystyleStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza.getName() + "\n");



    }

}
