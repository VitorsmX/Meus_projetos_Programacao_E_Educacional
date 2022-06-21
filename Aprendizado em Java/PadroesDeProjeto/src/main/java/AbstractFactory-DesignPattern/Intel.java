/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory1;

/**
 *
 * @author Nilson
 */
public class Intel extends FabricanteChips { 
    public Intel() {
        nomeFabrica = "Intel";
    }
    
    public Chip getChip( String nome ) {
        if( nome == null ) {
            return null;
        }
        else switch(nome) {
            case "i7":
                return new i7();
            case "i5":
                return new i5();
            case "i3":
                return new i3();
            default:
                return null;
        }
        
    }
}
