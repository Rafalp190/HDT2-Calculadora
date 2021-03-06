
// TODO: Auto-generated Javadoc
/**
 * The Class CalcuPost.
 */
public class CalcuPost implements I_Calculadora
{
	
	/** The Mi pila. */
	Stack<Integer> MiPila= new Stack<>();
	
	/** The resultado. */
	int resultado= 0;
	
	/** The string. */
	String string= " ";

	/* (non-Javadoc)
	 * @see ejercicio2.I_Calculadora#Calcular(java.lang.String)
	 */
	@Override
	public int Calcular(String vector) {
		// TODO Auto-generated method stub
		char[] cadena= vector.toCharArray();
		for (char i: cadena)
		{
			int num= Character.getNumericValue(i);
			if(num>=0)
			{
				MiPila.push(num);
			}
			else
			{
				/*if(i==' ')
				{
					
				}*/
				if(i=='+')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= a + b;
					MiPila.push(resultado);
					string = string + "Suma: "+ a + "+" + b + "=" + resultado + "\n";
				}
				if(i=='-')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= b - a;
					MiPila.push(resultado);
					string = string + "Resta: "+ b + "-" + a + "=" + resultado + "\n";
				}
				if(i=='*')
				{
					int a= MiPila.pop();
					int b= MiPila.pop();
					resultado= b * a;
					MiPila.push(resultado);
					string = string + "Multiplicacion: "+ b + "*" + a + "=" + resultado + "\n";
				}
				if(i=='/')
				{
					int b= MiPila.pop();
					int a= MiPila.pop();
					resultado= a/b;
					MiPila.push(resultado);
					string = string + "Division: "+ a + "/" + b + "=" + resultado + "\n";
				}
			}
		}
		return resultado;

	/**
	 * Leer archivo.
	 *
	 * @return the string
	 */
	@Override
	
	public String LeerArchivo() {
	 // Se abre el documento 
        String fileName = "canastadefrutas2.txt";
	String vector;
        // Leer una linea a la vez 
        String line = null;

        try {
            // FileReader lee el texto 
            FileReader fileReader = 
                new FileReader(fileName);

            
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                vector = line;
            }   

            // Cerrar el texto 
            bufferedReader.close();         
        }
        //Si no logra abir el archivo mandar un mensaje 
        catch(IOException ex) {
            System.out.println(
                "No se pudo leer el archivo '" 
                + fileName + "'");                  
        
        }
       
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
	{
		return string;
	}


}
