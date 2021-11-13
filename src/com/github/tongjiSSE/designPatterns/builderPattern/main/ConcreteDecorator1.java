package com.github.tongjiSSE.designPatterns.builderPattern.main;

public class ConcreteDecorator1 extends Decorator{
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
