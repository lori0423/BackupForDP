package com.github.tongjiSSE.designPatterns.factoryPattern.main;


public class NYFactory implements GlobalFactory{
    public Pizza createPizza() {
        System.out.println("NewYork's factory has ordered its NYPizza...");
        Pizza pizza = new NYPizza();
        return pizza;
    }
}
