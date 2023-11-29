/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facadepattern;

/**
 *
 * @author CUI
 */
public class FacadePattern {

    public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

 shapeMaker.drawCircle("Color: Red", "Thickness: 2");
shapeMaker.drawRectangle("Width: 10", "Height: 15", "Color: Blue");
shapeMaker.drawSquare("Side: 8", "Color: Green");
shapeMaker.drawTriangle("Side1: 3", "Side2: 4", "Side3: 5", "Color: Yellow");
shapeMaker.drawSphere("Radius: 6", "Color: Purple");
   }

    
}
