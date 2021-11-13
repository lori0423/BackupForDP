package com.github.tongjiSSE.designPatterns.simpleFactoryPattern.main;

public class PepperPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Pepper Pizza!");
    }
}
