public class Carros extends Veiculos{

    private int numPortas;
    private int numPassageiros;

    public Carros(String modelo, String fabricante){
         super(modelo, fabricante);
    }

    public void exibeInformacoes(){
        super.exibeInformacoes();
        System.out.println("Numero de passageiros: "+numPassageiros);
        System.out.println("Numero de portas: "+numPortas);
    }

    public void setNumPassageiros(int numPassageiros){
        
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros(){
        return numPassageiros;
    }

    public void setNumPortas(int numPortas){
        
        this.numPortas = numPortas;
    }

    public int getNumPortas(){
        return numPortas;
    }
}