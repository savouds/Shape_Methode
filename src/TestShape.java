
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class TestShape {
    public static void main(String[] args) {
         double a = 5, b = 3, c = 4;
        Triangle triangle = new Triangle(a,b,c);
        System.out.println("la longueur des cotés du triangle: " + a + ", " + b + ", " + c
                + "\nResultat Surface: " + triangle.surface()
                + "\nResultat Perimetre: " + triangle.perimetre() + "\n");
    }
}


