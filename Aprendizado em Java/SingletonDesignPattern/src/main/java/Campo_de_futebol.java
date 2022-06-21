import java.util.*;

//Heroi é um Singleton

public class Campo_de_futebol {
	
    
        private static Campo_de_futebol campo = null; 
        
        
	private String nome_estadio;
	
        
        private int capacidade;
	
	
		
	/*
	 *Não existe construtor público num Singleton
	 */
	private Campo_de_futebol() {}    //  Inibe o construtor padrão
	
	private Campo_de_futebol(String nome_estadio, int capacidade) {
		this.nome_estadio = nome_estadio;
		this.capacidade = capacidade;
	}
	
	public static Campo_de_futebol criaInstancia() {
		if (campo == null) {
			campo = new Campo_de_futebol(); 
		} 
		return campo; 
	} 

	public static Campo_de_futebol criaInstancia(String nome_estadio, int capacidade) {
		if (campo == null) {
			campo = new Campo_de_futebol(nome_estadio, capacidade); 
		} 
		return campo; 
	} 
	
	public void setNomeEstadio(String nome_estadio) {
		this.nome_estadio = nome_estadio;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNomeEstadio() {
		return this.nome_estadio;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}

	
        @Override
	public String toString() {
		return "Nome do estadio: " + nome_estadio + " Capacidade: "+ capacidade;
	}
}
