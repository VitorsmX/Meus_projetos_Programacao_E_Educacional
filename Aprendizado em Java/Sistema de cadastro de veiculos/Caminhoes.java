public class Caminhoes extends Veiculos{

    private int numEixos;
    private float capacidade;

    public Caminhoes(String modelo, String fabricante){
         super(modelo, fabricante);
    }

    public void exibeInformacoes(){
        super.exibeInformacoes();
        System.out.println("Numero de eixos: "+numEixos);
        System.out.println("Capacidade de carga: "+capacidade);
    }

    public void setNumEixos(int numEixos){
        
        this.numEixos = numEixos;
    }

    public int getNumEixos(){
        return numEixos;
    }

    public void setCapacidade(float capacidade){
        
        this.capacidade = capacidade;
    }

    public float getCapacidade(){
        return capacidade;
    }
}