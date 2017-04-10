/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
   
    abstract class Figure{

      abstract double area();  
      abstract boolean inside(Point P);
}
 class Cercle extends Figure{
     private Point center; 
     private double radius;

     public Cercle(double cx, double cy, double r) { // Constructor
         center = new Point(cx,cy);
         radius = r;
         
}  

     public Point getCenter() { return center; }
     public double getRadius() { return radius; }
     public void setCenter(Point p) { center = p; }
     public void setRadius(double r) { radius = r; }

     public double area() {
         return Math.PI * radius * radius;
       } 

     public boolean inside(Point P) {
          return (center.DistanceSq(P) < radius*radius); }

     public String toString() {
          return "Cercle["+ center.toString() + ", " + radius + "]"; }


}  


