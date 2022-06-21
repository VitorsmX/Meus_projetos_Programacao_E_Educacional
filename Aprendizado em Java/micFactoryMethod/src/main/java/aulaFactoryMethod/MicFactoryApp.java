/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaFactoryMethod;

/**
 *
 * @author Nilson
 */
public class MicFactoryApp {
    
    public static void main( String[] args ) {
        
        microfone microfone1 = FactoryMicrofone.getMic("MicComum");
        
        microfone microfone2 = FactoryMicrofone.getMic("MicMediano");
        
        microfone microfone3 = FactoryMicrofone.getMic("MicHeadset");
        
        microfone microfone4 = FactoryMicrofone.getMic("SpeechMike");
     
        
        System.out.println("\n O atenuador de ruído do " + microfone1.getNome() + " é: " + microfone1.getAtenuadoRuido());
        
        System.out.println("\n O atenuador de ruído do " + microfone2.getNome() + " é: " + microfone2.getAtenuadoRuido());
        
        System.out.println("\n O atenuador de ruído do " + microfone3.getNome() + " é: " + microfone3.getAtenuadoRuido());
        
        System.out.println("\n O atenuador de ruído do " + microfone4.getNome() + " é: " + microfone4.getAtenuadoRuido());
        
    }
    
}
