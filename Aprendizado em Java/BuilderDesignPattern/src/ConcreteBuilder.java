/**
 * Constructs and assembles parts of the product by
 * implementing the Builder interface. Defines and
 * keeps track of the representation it creates. Provides
 * an interface for retrieving the product.
 */

public class ConcreteBuilder implements Builder
{
	private Pneu pneu;

	private Motor motor;
	private Carro carro;

	public void buildPneu()
	{
		pneu = new Pneu();
		System.out.println("Pneu... " + pneu.getPressao());
	}

	

	public void buildMotor(int potencia) 
	{ 
		motor = new Motor(potencia);
		System.out.println("Motor... " + motor.getPotencia());		
	}


	public Carro getCarro()
	{ 
		System.out.println("Carro...");	
		return new Carro(pneu, motor);
	}
}