/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Nilson
 */
public class PrincipalFactory {
    
    public static void main( String args[] ) {
        
        Carro carro1 = FactoryCarro.getCarro("Ferrari");
        
        Carro carro2 = FactoryCarro.getCarro("Gol");
        
        if(carro1 != null) {
            System.out.println("Velocidade Final: " + carro1.getVelocidadeFinal());
        }
        
        if(carro2 != null) {
            System.out.println("Velocidade Final: " + carro2.getVelocidadeFinal());
        }
        
    }
    
}
