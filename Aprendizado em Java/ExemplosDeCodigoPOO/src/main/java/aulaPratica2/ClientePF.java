/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaPratica2;

/**
 *
 * @author Nilson
 */
public class ClientePF extends Cliente {
    
      private String cpf;
      private String tipoPF;
      
      public ClientePF(String nome, String endereco, String cpf, String tipoPF) {
        super(nome, endereco);
        this.cpf = cpf;  
        this.tipoPF = tipoPF;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTipo() {
        return tipoPF;
    }
    
    public void setTipo(String tipoPF) {
        this.tipoPF = tipoPF;
    }
    
    public String toString() {
        return super.toString()+"\ncpf: "+cpf+"\n";
    }
}
