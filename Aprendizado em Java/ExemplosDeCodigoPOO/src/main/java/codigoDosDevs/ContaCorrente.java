/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoDosDevs;

/**
 *
 * @author Nilson
 */
public class ContaCorrente {
    private int numero;
    private int agencia;
    
public ContaCorrente(int numero, int agencia){
    this.numero = numero;
    this.agencia = agencia;
}  

public void setNumero(int numero){
   this.numero = numero;
}

public int getNumero(){
    return numero;
    
}

public void setAgencia(int agencia){
   this.agencia = agencia;
}

public int getAgencia(){
    return agencia;
}
}

