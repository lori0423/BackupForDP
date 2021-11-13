package com.github.tongjiSSE.designPatterns.factoryPattern.main;

public class LDFactory implements GlobalFactory{
    public Pizza createPizza() {
        System.out.println("London's factory has ordered its LDPizza...");
        Pizza pizza = new LDPizza();
        return pizza;
    }
}
