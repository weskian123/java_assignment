/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author weskian
 */
public class Circle {
    
    private double radius;
    private String color;
    
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea() {
        return Math.PI * radius * radius;
    }
    
    public double findCircumference() {
        return 2 * Math.PI * radius;
    }
    
    @Override
public String toString() {
    return "Properties:\n" +
           "Radius: " + radius + "\n" +
           "Color: " + color + "\n" +
           "Area: " + findArea() + "\n" +
           "Circumference: " + findCircumference();
}
}
