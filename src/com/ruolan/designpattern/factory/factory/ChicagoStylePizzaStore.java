package com.ruolan.designpattern.factory.factory;


import com.ruolan.designpattern.factory.factory.chicago.ChicagoStyleCheesePizza;
import com.ruolan.designpattern.factory.factory.chicago.ChicagoStyleClamPizza;
import com.ruolan.designpattern.factory.factory.chicago.ChicagoStylePepperoniPizza;
import com.ruolan.designpattern.factory.factory.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }
}
