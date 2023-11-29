/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author CUI
 */
public class Sphere implements Shape {
         

    @Override
    public Void Draw(String... options) {
       System.out.println("<< The SHAPE I  will draw is >>");
        System.out.println("SPHERE::draw()");
         System.out.println("Sphere::draw()" + PrintWithOptions(options));
        return null;
    }

    private String PrintWithOptions(String[] options) {
        String OptionsForPrints = "";
        for (var opt : options)
            OptionsForPrints += opt + "";
        return OptionsForPrints;
    }
}
    


    

