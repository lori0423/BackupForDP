package com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main;

import com.github.tongjiSSE.designPatterns.factoryPattern.main.LDPizza;
import com.github.tongjiSSE.designPatterns.factoryPattern.main.Pizza;

public class LDFactory implements GlobalFactory{
    public Pizza createPizza() {
        System.out.println("London's factory has ordered its LDPizza...");
        Pizza pizza = new LDPizza();
        return pizza;
    }
    public Spaghetti createSpaghetti() {
        System.out.println("London's factory has ordered its LDSpaghetti...");
        return new LDSpaghetti();
    }
}
