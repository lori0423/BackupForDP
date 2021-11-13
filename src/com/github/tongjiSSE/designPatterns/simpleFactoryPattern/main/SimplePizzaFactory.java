package com.github.tongjiSSE.designPatterns.simpleFactoryPattern.main;


public class SimplePizzaFactory {
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
