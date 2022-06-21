/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica1;

/**
 *
 * @author Nilson
 */
public class PessoaApp {
    
     public static void main(String[] args) {
     
         Pessoa pessoa1 = new Pessoa(15, "vitor");
         
         Pessoa pessoa2 = new Pessoa(22, "Vitinho");
         
         System.out.println("O nome do objeto pessoa 1 é: " + pessoa1.getNome() + "\n" + "Seu código é: " + pessoa1.getCodigo());
     
         pessoa1.setNome("Vitor");
         
         System.out.println("O novo nome do objeto pessoa 1 é: " + pessoa1.getNome() + "\n" + "Seu código é: " + pessoa1.getCodigo());
         
         pessoa1.setCodigo(12);
         
         System.out.println("O novo nome do objeto pessoa 1 é: " + pessoa1.getNome() + "\n" + "Seu novo código é: " + pessoa1.getCodigo());
     }
    
}
