package com.github.tongjiSSE.designPatterns.factoryPattern.main;

public class NYPizza implements Pizza{
    public void makePizza() {
        System.out.println("NewYork's Pizza is making!");
        System.out.println("NewYork's Pizza is ready!");
    }
}
