package com.github.tongjiSSE.designPatterns.builderPattern.main;

public class Parlour {
    private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setTV(String TV) {
        this.TV = TV;
    }
    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show() {
        String parlour = wall +", "+ TV + ", "+sofa;
        System.out.println("\nThe parlour consists of "+parlour+" !\n");
    }
}
