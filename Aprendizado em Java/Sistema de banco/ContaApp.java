import java.util.Scanner;

public class ContaApp
{
    public static void main (String[] args)
    {
        

        //Scanner input = new Scanner(System.in);

        Conta conta1 = new Conta("Joao", "91-23234545", "0708", "43556");

        conta1.setTitular("Joao Carlos");

        conta1.depositar(200);
        conta1.depositar(300);

        conta1.exibirSaldo();

        conta1.sacar(250);

        conta1.exibirSaldo();

        conta1.sacar(300);
        
    }
}