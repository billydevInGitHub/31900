package practice200322.factory;

import practice200322.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing shape rectangle");
    }
}
