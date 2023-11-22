/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Dell
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Shape circle = new Circle();
        System.out.println("\n What is your Shape with normal Border?");
        System.out.println("Circle with normal border:");
        circle.draw();
        System.out.println();

       
        Shape redCircle = new RedShapeDecorator(new Circle());
     
        System.out.println("\nCircle with red border:");
        redCircle.draw();
        System.out.println();

        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        
        System.out.println("\nRectangle with red border:");
        redRectangle.draw();
        System.out.println();

       
        Shape redCircleWithThickBorder = new ThickBorderShapeDecorator(new RedShapeDecorator(new Circle()));
          System.out.println("\n What is your Shape with Red Border and thick Border");
        System.out.println("\nCircle with red border and thick border:");
        redCircleWithThickBorder.draw();
    }
}
    
    

