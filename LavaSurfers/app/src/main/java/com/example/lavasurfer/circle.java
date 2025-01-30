package com.example.lavasurfer;

public class circle extends Shape{
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = "blue";
    }

    private String color;


}
