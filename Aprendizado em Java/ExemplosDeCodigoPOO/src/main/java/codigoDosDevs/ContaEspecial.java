/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoDosDevs;

/**
 *
 * @author Nilson
 */
public class ContaEspecial extends ContaCorrente {
    private int limite;
    
public ContaEspecial(int numero, int agencia, int limite){
   super (numero,agencia);
   this.limite = limite;
    
}
public void setLimite(int limite){
   this.limite = limite;
}

public int getLimite(){
    return limite;
}
}
