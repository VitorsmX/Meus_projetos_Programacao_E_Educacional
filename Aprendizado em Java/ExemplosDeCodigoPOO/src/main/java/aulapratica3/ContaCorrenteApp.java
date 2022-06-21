/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica3;

/**
 *
 * @author Nilson
 */
public class ContaCorrenteApp {
    
    public static void main(String[] args) {
    
        ContaCorrente contacomum = new ContaCorrente(123,222);
        ContaCorrente contaespecial = new ContaCorrente(129,124,1000.00f);
        System.out.println("***Segue os dados da conta corrente comum***\n" + "Numero da conta: " + contacomum.getNumero() +
                "\n" + "Agência: " + contacomum.getAgencia() + "\n");
        System.out.println("***Segue os dados da conta corrente especial***\n" + "Numero da conta: " + contaespecial.getNumero() +
                "\n" + "Agência: " + contaespecial.getAgencia() + "\n" + "Limite: " + contaespecial.getLimite() + "\n");
        
        
    }
    
}
