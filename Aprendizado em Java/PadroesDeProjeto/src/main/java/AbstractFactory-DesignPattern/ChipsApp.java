/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory1;

/**
 *
 * @author Nilson
 */
public class ChipsApp {
    public static void main( String[]args ) {
        
        FabricanteChips fab = FabricanteChips.getInstance("Intel");
        Chip chip1 = fab.getChip("i3");
        
        FabricanteChips fab2 = FabricanteChips.getInstance("Intel");
        Chip chip2 = fab2.getChip("i5");
        
        FabricanteChips fab3 = FabricanteChips.getInstance("Intel");
        Chip chip3 = fab3.getChip("i7");
        
        
        FabricanteChips fab4 = FabricanteChips.getInstance("AMD");
        Chip chip4 = fab4.getChip("amd_x");
        
        FabricanteChips fab5 = FabricanteChips.getInstance("AMD");
        Chip chip5 = fab5.getChip("amd_y");
        
        FabricanteChips fab6 = FabricanteChips.getInstance("AMD");
        Chip chip6 = fab6.getChip("amd_z");
        
        System.out.println("**Tabela My SQL - Chips**");
        
        if ( chip1 != null ) {
            System.out.println("Marca: " + chip1.getMarca() + "\n" + "Nome: " + chip1.getNome());
        }
        
        if ( chip2 != null ) {
            System.out.println("Marca: " + chip2.getMarca() + "\n" + "Nome: " + chip2.getNome());
        }
        
        if ( chip3 != null ) {
            System.out.println("Marca: " + chip3.getMarca() + "\n" + "Nome: " + chip3.getNome());
        }
        
        if ( chip4 != null ) {
            System.out.println("Marca: " + chip4.getMarca() + "\n" + "Nome: " + chip4.getNome());
        }
        
        if ( chip5 != null ) {
            System.out.println("Marca: " + chip5.getMarca() + "\n" + "Nome: " + chip5.getNome());
        }
        
        if ( chip6 != null ) {
            System.out.println("Marca: " + chip6.getMarca() + "\n" + "Nome: " + chip6.getNome());
        }
    }
}
