/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy;

/**
 *
 * @author CUI
 */
public class Proxy {

    public static void main(String[] args) {
       Image image= new RealImage("test 10 mbps");
       image.diplay();
       Image primage=new ProxyImage("test 10mbps");
        primage.diplay();
        System.out.println(" ");
        primage.diplay();
    }
}