/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeFacMet;

/**
 *
 * @author Nilson
 */
public class FactoryPhoneApp {
    public static void main( String []args ) {
        
        Celular celular1 = FactoryCelular.getMarca("A10");
        
        Celular celular2 = FactoryCelular.getMarca("Windows Phone");
        
        System.out.println("Ligando seu " + celular1.getMarca() + "\n" + "iniciando..." + celular1.getMensagem() + "\n");
        
        System.out.println("Ligando seu " + celular2.getMarca() + "\n" + "iniciando..." + celular2.getMensagem() + "\n");
    
    }
}
