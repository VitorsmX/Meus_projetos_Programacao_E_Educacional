/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica3;

/**
 *
 * @author Nilson
 */
public class ContaCorrente {
    private int numero, agencia;
    private float limite;
    
    public ContaCorrente(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public ContaCorrente(int numero, int agencia, float limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public float getLimite() {
        return limite;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public void setLimite(float limite) {
        this.limite = limite;
    }
}
