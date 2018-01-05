package com.ruolan.designpattern.factory.factory;

import com.ruolan.designpattern.factory.factory.nystyle.NYStyleCheesePizza;
import com.ruolan.designpattern.factory.factory.nystyle.NYStyleClamPizza;
import com.ruolan.designpattern.factory.factory.nystyle.NYStylePepperoniPizza;
import com.ruolan.designpattern.factory.factory.nystyle.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
