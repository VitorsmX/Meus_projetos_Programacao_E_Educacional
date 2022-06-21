/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistAcadRH;

/**
 *
 * @author Nilson
 */
public class ProfessorEspecialista extends PrototipoProfessor {
    
    
    public PrototipoProfessor clonar() {
        PrototipoProfessor professorEspecialista = new ProfessorEspecialista();
        
        professorEspecialista.setNome("Olavio");
        professorEspecialista.setEndereco("Castanhal, Bairro Jardim, Rua Margarida, 27");
        professorEspecialista.setValorHoraAula(40);
        professorEspecialista.setExperienciaDeMercado(2);
        
        return professorEspecialista;
    } 
}
