
/**
 * Specifies an abstract interface for creating parts of
 * a Product object.
 */

public interface Builder
{
	void buildPneu();
	void buildMotor(int potencia);
	
	Carro getCarro();
}