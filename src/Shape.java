





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sepele Cyrille
 */

public abstract class Shape {
    public abstract double surface();
    public abstract double perimetre();
}

    class Triangle extends Shape {
    private final double a, b, c; 
    
    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double surface() {
    
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimetre() {
        return a + b + c;
    }
    }
