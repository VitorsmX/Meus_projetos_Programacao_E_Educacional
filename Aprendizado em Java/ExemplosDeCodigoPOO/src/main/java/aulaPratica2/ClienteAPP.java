/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaPratica2;

/**
 *
 * @author Nilson
 */
public class ClienteAPP {
    
    public static void main(String[] args) {
    
        ClientePF clientepf1 = new ClientePF("João", "Rua Cristino Da Silva Quiroz, 992", "00803563705", "Pessoa Física");
        ClientePJ clientepj1 = new ClientePJ("Cibrasa", "Rua Estatinus Filho, 276", "0080356387677","Pessoa Jurídica");
        
        clientepf1.setCpf("00901828209");
        
        clientepj1.setCnpj("0080000000");
        
        System.out.println(clientepj1.getTipo() + "\n" + clientepj1.toString());
        System.out.println(clientepf1.getTipo() + "\n" + clientepf1.toString());
    }
    
}
