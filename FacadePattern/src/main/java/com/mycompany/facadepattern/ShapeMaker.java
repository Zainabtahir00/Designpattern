/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author CUI
 */
public class ShapeMaker{
   private Shape circle;
   private Shape square;
   private Shape rectangle;
   private Shape triangle;
   private Shape sphere;
       
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

     public void drawCircle(String... options) {
        circle.Draw(options);
    }

    public void drawRectangle(String... options) {
        rectangle.Draw(options);
    }

    public void drawSquare(String... options) {
        square.Draw(options);
    }

    public void drawTriangle(String... options) {
        triangle.Draw(options);
    }

    public void drawSphere(String... options) {
        sphere.Draw(options);
    }
}