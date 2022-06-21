public class Carro {
	private Motor motor;
	
	private Pneu pneu[];
	private String cor;
	
	public Carro() {
		motor = criaMotor();
		

		pneu = new Pneu[4];		
		for (int i = 0; i < 4; i++)		
			pneu[i] = criaPneu();
		cor = "";
	}
	
	protected Motor criaMotor() {
		return new Motor();
	}
	
	protected Pneu criaPneu() {
		return new Pneu();
	}
	
	
	
	public Carro(Motor motor) {
		this.motor = motor;
		
		pneu = new Pneu[4];
		for (int i = 0; i < 4; i++)		
			pneu[i] = criaPneu();
		cor = "azul";			
	}

	public Carro(Pneu pneu, Motor motor)	{
		this();
		this.motor = motor;
		for (int i = 0; i < 4; i++)
			this.pneu[i] = pneu;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;	
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	
	
	public Pneu[] getPneu() {
		return this.pneu;
	}
	
    public String toString() {
    	return "Carro " + cor + 
    			" com motor com " + 
    			motor.getPotencia() + " hp " + 
    		" e pressao do pneu = " 
    		+ pneu[0].getPressao();
    }
	
}