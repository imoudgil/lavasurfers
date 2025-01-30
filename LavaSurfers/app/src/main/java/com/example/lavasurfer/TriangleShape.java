package com.example.lavasurfer;


// Abstract class extending Shape
public abstract class TriangleShape extends Shape {

    String color = "@colors/blue";
    private int base;
    private int height;

    // Constructor
    public TriangleShape(int x, int y, int base, int height) {
        setX(x);
        setY(y);
        this.base = base;
        this.height = height;
    }

    // Getter and Setter for base
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    // Getter and Setter for height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Abstract method to calculate the area
    public abstract double calculateArea();
}

