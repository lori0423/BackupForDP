package com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main;

import com.github.tongjiSSE.designPatterns.factoryPattern.main.NYPizza;
import com.github.tongjiSSE.designPatterns.factoryPattern.main.Pizza;

public class NYFactory implements GlobalFactory{
    public Pizza createPizza() {
        System.out.println("NewYork's factory has ordered its NYPizza...");
        Pizza pizza = new NYPizza();
        return pizza;
    }
    public Spaghetti createSpaghetti() {
        System.out.println("NewYork's factory has ordered its NYSpaghetti...");
        return new NYSpaghetti();
    }
}
