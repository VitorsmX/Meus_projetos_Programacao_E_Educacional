import java.util.Scanner;

public class JogoApp
{
    public static void main (String[] args)
    {
        

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do novo jogador: ");
        String novoJogador = input.nextLine();
        Jogador jogador1 = new Jogador(novoJogador);
        

        Jogador jogador2 = new Jogador("Ana");

        //jogador1.setApelido("Carlos");
        jogador1.setIdade(21);

       

        System.out.println("Apelido do jogador: "+jogador1.getApelido());
        System.out.println("Idade do jogador: "+jogador1.getIdade());
        System.out.println("Apelido do jogador: "+jogador2.getApelido());

        
        
    }
}