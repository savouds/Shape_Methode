/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Point {
     private double x,y;  
            // Square of the distance from this to Q.
     public Point(double xx, double yy) {   // Constructor
         x = xx; y = yy; }
     
     //Getters
     public double getX() { return x; }    
     public double getY() { return y; } 
     
     //Setters
     public void setX(double xx) { x = xx; } 
     public void setY(double yy) { y = yy; } 
     public double DistanceSq(Point Q) { 
       return (x-Q.x)*(x-Q.x) + (y-Q.y)*(y-Q.y); }
     public double Distance(Point Q) { 
       return Math.sqrt(DistanceSq(Q)); }
     public String toString () {
       return "Point[" + x + ", " + y + "]"; }
} 


