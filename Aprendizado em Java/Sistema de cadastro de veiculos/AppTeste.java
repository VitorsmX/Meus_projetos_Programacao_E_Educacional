import java.util.Scanner;

public class AppTeste
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o modelo do veiculo:");
        String modelo = input.nextLine();

        System.out.println("Digite o fabricante do veiculo:");
        String fabricante = input.nextLine();

        Carros carro1 = new Carros(modelo, fabricante);

        carro1.setPlaca("QVF2323");
        carro1.setProprietario("Leonardo");
        carro1.setKm(2000);
        carro1.setCor("Vermelho");
        carro1.setNumPortas(5);
        carro1.setNumPassageiros(5);

        carro1.exibeInformacoes();

        System.out.println("\n Nome do proprietario: "+carro1.getProprietario());

        Veiculos veiculo1 = new Veiculos("Onix", "GM");
        veiculo1.exibeInformacoes();


        Caminhoes caminhao1 = new Caminhoes("Cargo", "FORD");

        caminhao1.setPlaca("QVF3434");
        caminhao1.setProprietario("Carlos");
        caminhao1.setKm(3000);
        caminhao1.setCor("Branco");
        caminhao1.setNumEixos(3);
        caminhao1.setCapacidade(20000);
        caminhao1.exibeInformacoes();



        Veiculos veiculo2 = new Veiculos("HB20");

        veiculo2.setPlaca("QVF9090");
        veiculo2.setProprietario("Ana");
        veiculo2.exibeInformacoes();
    }
}