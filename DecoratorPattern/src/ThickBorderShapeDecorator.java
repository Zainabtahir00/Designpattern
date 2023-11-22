/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

public class ThickBorderShapeDecorator extends ShapeDecorator {
    public ThickBorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setThickBorder();
    }

    private void setThickBorder() {
        System.out.println("Border: Thick");
    }
}


