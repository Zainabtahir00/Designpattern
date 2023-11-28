/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author CUI
 */
public class RealImage implements   Image {
 private String filename;
 public RealImage(String filename){
     this.filename=filename;
     loadfromDisk(filename);
     
 }
    @Override
    public void diplay() {
        System.out.println("display file"+filename);
       
    }
    private void loadfromDisk(String filename){
        System.out.println("loading" +filename);
    }
    
}
