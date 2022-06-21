/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory1;

/**
 *
 * @author Nilson
 */
public abstract class FabricanteChips {
    
    protected String nomeFabrica;
    
    public abstract Chip getChip( String marca );
    
    public static FabricanteChips getInstance( String fabricante ) {
        
        if ( null == fabricante )
            return null;
        
        else switch (fabricante) {
            case "Intel":
                return new Intel();
            case "AMD":
                return new AMD();
            default:
                return null;
        }
        
    }
    
}
