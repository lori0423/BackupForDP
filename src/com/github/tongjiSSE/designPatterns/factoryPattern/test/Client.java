package com.github.tongjiSSE.designPatterns.factoryPattern.test;

import com.github.tongjiSSE.designPatterns.factoryPattern.main.LDFactory;
import com.github.tongjiSSE.designPatterns.factoryPattern.main.NYFactory;
import com.github.tongjiSSE.designPatterns.factoryPattern.main.Pizza;

public class Client {
    public static void main(String[] args) {
        try {
            NYFactory myFactory1=new NYFactory();
            Pizza myPizza1 = myFactory1.createPizza();
            myPizza1.makePizza();

            LDFactory myFactory2=new LDFactory();
            Pizza myPizza2=myFactory2.createPizza();
            myPizza2.makePizza();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
