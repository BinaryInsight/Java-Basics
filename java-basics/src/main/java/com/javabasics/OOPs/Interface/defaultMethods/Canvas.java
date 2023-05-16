package com.javabasics.OOPs.Interface.defaultMethods;

public class Canvas implements Painting {

    @Override
    public void paint() {
        System.out.println("This is Canvas Painting");
    }

    public void ink() {

    }
}
