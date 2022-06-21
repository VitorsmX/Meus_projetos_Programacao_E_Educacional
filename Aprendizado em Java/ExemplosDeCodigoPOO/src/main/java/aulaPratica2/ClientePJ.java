/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaPratica2;

/**
 *
 * @author Nilson
 */
public class ClientePJ extends Cliente {
    
    private String cnpj;
    private String tipoPJ;
    
    public ClientePJ(String nome, String endereco, String cnpj, String tipoPJ) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.tipoPJ = tipoPJ;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getTipo() {
        return tipoPJ;
    }
    
    public void setTipo(String tipoPJ) {
        this.tipoPJ = tipoPJ;
    }
    
    public String toString() {
        return super.toString()+"\ncnpj: "+cnpj+"\n";
    }
}
