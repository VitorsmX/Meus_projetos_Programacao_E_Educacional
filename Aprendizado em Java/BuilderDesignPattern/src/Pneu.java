public class Pneu {

    private String marca;
	private int aro;
	private int pressao;

	public Pneu() {
		this.pressao = 0;
		this.aro = 14;
	}
	
    Pneu(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

	public int getPressao() {
	    return this.pressao;
	}
	
	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

}
 
