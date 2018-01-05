package com.ruolan.designpattern.factory.factory;

import com.ruolan.designpattern.factory.factory.normal.CheesePizza;
import com.ruolan.designpattern.factory.factory.normal.ClamPizza;
import com.ruolan.designpattern.factory.factory.normal.PepperoniPizza;
import com.ruolan.designpattern.factory.factory.normal.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

        return pizza;

    }

}
