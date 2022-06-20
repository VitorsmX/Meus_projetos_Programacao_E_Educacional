public class Veiculos{
    
    private String placa;
    private String modelo;
    private String fabricante;
    private String proprietario;
    private String cor;
    private int km;

    
    public Veiculos(String modelo, String fabricante){
         this.modelo = modelo;
         this.fabricante = fabricante;
         km = 0;
    }

    public Veiculos(String modelo){
         this.modelo = modelo;
         km = 0;
    }


    public void exibeInformacoes(){
        System.out.println("\nModelo: "+modelo);
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
        System.out.println("Proprietario: "+proprietario);
        System.out.println("Quilometragem: "+km);
    }

    
    public void setKm(int km){
        
        if (km < this.km) System.out.println("Quilometragem inválida");
        else this.km = km;
    }

    public int getKm(){
        return km;
    }

    public void setProprietario(String proprietario){  
        this.proprietario = proprietario;
    }

    public String getProprietario(){
        return proprietario;
    } 

    public void setPlaca(String placa){  
        this.placa = placa;
    }

    public String getPlaca(){  
        return placa;
    }

    public void setCor(String cor){  
        this.cor = cor;
    }

    public String getCor(){  
        return cor;
    }
}