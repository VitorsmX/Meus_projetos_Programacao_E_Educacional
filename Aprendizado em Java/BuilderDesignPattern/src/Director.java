/**
 * Constructs an object using the Builder interface.
 */

public class Director
{
	private Builder builder;

	public Director( Builder builder )
	{
		this.builder = builder;
	}

	public void construct()
	{
		builder.buildPneu();
		builder.buildMotor(120);
		
	}
}