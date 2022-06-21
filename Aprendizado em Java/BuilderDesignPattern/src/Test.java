/**
 * Test code for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Builder builder = new ConcreteBuilder();
			Director director = new Director( builder );
			director.construct();
			Carro carro = builder.getCarro();
			System.out.println(carro);
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}