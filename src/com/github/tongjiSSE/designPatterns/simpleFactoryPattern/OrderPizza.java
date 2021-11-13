package com.github.tongjiSSE.designPatterns.simpleFactoryPattern;

import com.github.tongjiSSE.designPatterns.simpleFactoryPattern.main.Pizza;
import com.github.tongjiSSE.designPatterns.simpleFactoryPattern.main.SimplePizzaFactory;

public class OrderPizza {
    public static void main(String[] args) {
        SimplePizzaFactory mSimplePizzaFactory=new SimplePizzaFactory();
        Pizza pizza1=mSimplePizzaFactory.CreatePizza("cheese");
        pizza1.prepare();
        System.out.println("And then it is baked,cut,boxed!");
        System.out.println("Finally,it's done!");
    }
}
