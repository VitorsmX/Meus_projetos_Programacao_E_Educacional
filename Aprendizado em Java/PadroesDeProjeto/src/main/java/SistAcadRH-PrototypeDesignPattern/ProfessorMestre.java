/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistAcadRH;

/**
 *
 * @author Nilson
 */
public class ProfessorMestre extends PrototipoProfessor {
    
    
    public PrototipoProfessor clonar() {
        PrototipoProfessor professorMestre = new ProfessorMestre();
        
        professorMestre.setNome("Octavius");
        professorMestre.setEndereco("Belém, Bairro Ruas, Rua Bairros, 1268");
        professorMestre.setValorHoraAula(60);
        professorMestre.setExperienciaDeMercado(5);
        
        return professorMestre;
    } 
} 
      
