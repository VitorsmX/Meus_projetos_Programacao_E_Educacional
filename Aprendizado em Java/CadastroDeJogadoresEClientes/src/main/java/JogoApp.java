import java.util.Scanner;
import model.Jogador;

public class JogoApp {

    public static void main(String[] args) {
    
        Jogador Jogadores1 = new Jogador();
        Scanner texto = new Scanner(System.in);
        System.out.println("Entre com um apelido: ");
        Jogador.Apelido = texto.nextLine();
        System.out.println("Apelido: "+ Jogadores1.getApelido());
        System.out.println("Idade: "+ Jogadores1.getIdade());
        
        texto.close();
    
    }
    
}