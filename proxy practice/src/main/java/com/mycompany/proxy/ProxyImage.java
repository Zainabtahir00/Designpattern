/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author CUI
 */
public class ProxyImage implements Image {
private RealImage realimage;
private String filename;
public ProxyImage(String filename){
    this.filename=filename;
}
public String getFilename(){
    return filename;
}
    @Override
    public void diplay() {
        if(realimage==null){
            realimage=new RealImage(filename);
        }
        realimage.diplay();
    }
    
}
