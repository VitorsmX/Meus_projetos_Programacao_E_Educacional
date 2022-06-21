/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory1;

/**
 *
 * @author Nilson
 */
public class AMD extends FabricanteChips { 
    public AMD() {
        nomeFabrica = "AMD";
    }
    
    public Chip getChip( String nome ) {
        if( nome == null ) {
            return null;
        }
        else switch(nome) {
            case "amd_x":
                return new Amd_x();
            case "amd_y":
                return new Amd_y();
            case "amd_z":
                return new Amd_z();
            default:
                return null;
        }
        
    }
}

