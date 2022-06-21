/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoDosDevs;

/**
 *
 * @author Nilson
 */
public class ContaCorrenteAPP {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente(12324, 0254-5);
        ContaEspecial cliente2 = new ContaEspecial(13542, 2546-9, 15000);
        
        System.out.println("Segue os dado da Conta Corrente: ");
        System.out.println("numero: " + cliente1.getNumero());
        System.out.println("agencia: " + cliente1.getAgencia());
        
        
        System.out.println("Segue os dado da Conta Especial: ");
        System.out.println("numero: " + cliente2.getNumero());
        System.out.println("agencia: " + cliente2.getAgencia());
        System.out.println("agencia: " + cliente2.getLimite());
        
    }
}
