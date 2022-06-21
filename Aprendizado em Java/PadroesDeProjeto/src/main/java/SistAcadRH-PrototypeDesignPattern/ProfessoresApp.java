/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistAcadRH;

/**
 *
 * @author Nilson
 */

public class ProfessoresApp {

    public static void main( String[] args ) {
        
        PrototipoProfessor professor1 = new ProfessorEspecialista().clonar();
        PrototipoProfessor professor2 = new ProfessorMestre().clonar();

        System.out.println("Professor1: " + professor1.toString());
        System.out.println("Professor2: " + professor2.toString());
    }
    
}
