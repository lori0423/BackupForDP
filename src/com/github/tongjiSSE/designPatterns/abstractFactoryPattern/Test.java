package com.github.tongjiSSE.designPatterns.abstractFactoryPattern;

import com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main.GlobalFactory;
import com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main.LDFactory;
import com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main.NYFactory;
import com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main.Spaghetti;
import com.github.tongjiSSE.designPatterns.factoryPattern.main.Pizza;

public class Test {
    public static void main(String[] args) {
        try {
            GlobalFactory myFactory1;
            GlobalFactory myFactory2;
            Spaghetti mySpaghetti;
            Pizza myPizza;
            myFactory1=new LDFactory();
            myFactory2=new NYFactory();
            myPizza=myFactory1.createPizza();
            mySpaghetti=myFactory2.createSpaghetti();
            myPizza.makePizza();
            mySpaghetti.makeSpaghetti();
            System.out.println("\nI've got LDPizza and NYSpaghetti!\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
