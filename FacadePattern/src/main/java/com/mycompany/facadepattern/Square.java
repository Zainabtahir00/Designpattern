/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author CUI
 */
public class Square  implements Shape{

    @Override
    public Void Draw(String... options) {
        System.out.println("<< The SHAPE I  will draw is >>");
        System.out.println("Square::Draw()");
                System.out.println("Square::draw()" + PrintWithOptions(options));
        return null;
    }

    private String PrintWithOptions(String[] options) {
        String OptionsForPrints = "";
        for (var opt : options)
            OptionsForPrints += opt + "";
        return OptionsForPrints;
    }

    }
    

