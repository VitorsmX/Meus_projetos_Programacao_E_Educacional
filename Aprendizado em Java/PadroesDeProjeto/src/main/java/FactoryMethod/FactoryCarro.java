/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Nilson
 */
public class FactoryCarro {
    
    public static Carro getCarro(String tipoCarro) {
        
        if (tipoCarro == null) 
            return null;
        
        else if (tipoCarro.equals("Ferrari"))
            return new Ferrari();
            
        else if (tipoCarro.equals("Gol"))
            return new Gol();
        
        else
            return null;
    }
    
}
