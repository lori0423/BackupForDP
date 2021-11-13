package com.github.tongjiSSE.designPatterns.builderPattern;

import com.github.tongjiSSE.designPatterns.builderPattern.main.ConcreteDecorator1;
import com.github.tongjiSSE.designPatterns.builderPattern.main.Decorator;
import com.github.tongjiSSE.designPatterns.builderPattern.main.Parlour;
import com.github.tongjiSSE.designPatterns.builderPattern.main.ProjectManager;

public class BuilderTest {
    public static void main(String[] args) {
        try {
            Decorator d;
            d=new ConcreteDecorator1();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
