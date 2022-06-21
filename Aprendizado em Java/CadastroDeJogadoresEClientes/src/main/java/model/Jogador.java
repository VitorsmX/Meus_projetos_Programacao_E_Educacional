
package model;


public class Jogador {
    
    private String Apelido;
    private int Idade;

    public Jogador() {
        
    }

    public Jogador(String Apelido, int Idade) {
        this.Apelido = Apelido;
        this.Idade = Idade;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
    
}

