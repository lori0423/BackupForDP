package com.github.tongjiSSE.designPatterns.simpleFactoryPattern.main;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Prepare Cheese Pizza!");
    }
}
