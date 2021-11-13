package com.github.tongjiSSE.designPatterns.abstractFactoryPattern.main;

import com.github.tongjiSSE.designPatterns.factoryPattern.main.Pizza;

public interface GlobalFactory {
    Pizza createPizza();
    Spaghetti createSpaghetti();
}
