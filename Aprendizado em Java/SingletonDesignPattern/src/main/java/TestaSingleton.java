import java.util.*;

public class TestaSingleton {

	public static void main(String args[]) {
		
               Campo_de_futebol C1;
                
		C1 = Campo_de_futebol.criaInstancia("Mangueirão", 20000);

		C1.setCapacidade(20000);


		System.out.println("Campo de futebol: "+ C1.getNomeEstadio());
               
                
                System.out.println("Capacidade: "+ C1.getCapacidade());
		
        	
		
		
	}
}