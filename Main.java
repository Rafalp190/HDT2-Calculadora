
// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String []args)
	{
		CalcuPost calcu= new CalcuPost();
		String cadena= "8 2 /";
		
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
