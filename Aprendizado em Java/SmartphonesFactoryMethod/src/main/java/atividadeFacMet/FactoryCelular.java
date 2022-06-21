/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeFacMet;

/**
 *
 * @author Nilson
 */
public class FactoryCelular {
    public static Celular getMarca(String marca) {
        
        if (null == marca) 
            return null;
        
        else switch (marca) {
            case "Windows Phone":
                return new WindowsPhone();
            case "A10":
                return new A10();
            default:
                return null;
        }
       
        
    }
    
}
