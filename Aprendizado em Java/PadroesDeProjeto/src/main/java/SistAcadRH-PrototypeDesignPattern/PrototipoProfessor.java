/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistAcadRH;

/**
 *
 * @author Nilson
 */
public abstract class PrototipoProfessor {
    private String nome;
    private String endereco;
    private int valorHoraAula;
    private int experienciaDeMercado;
    
    public abstract PrototipoProfessor clonar();
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getValorHoraAula() {
        return valorHoraAula;
    }
    
    public void setValorHoraAula(int valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
    public int getExperienciaDeMercado() {
        return experienciaDeMercado;
    }
    
    public void setExperienciaDeMercado(int experienciaDeMercado) {
        this.experienciaDeMercado = experienciaDeMercado;
    }
    
    @Override
    public String toString() {
        return "\nNome do professor: " + nome + " \nEndereço: " + endereco + "\nValor da hora dee aula: " + valorHoraAula + "\nExperiência de mercado: " + experienciaDeMercado + "\n";
    }
}
