/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 07:18 pm*/


public class ejercicio66_numerosprimos
{
	public static void main(String[] args)
	{
	
        	int suma=0;
		int contadorPrimos=0;
		for (int i=1;contadorPrimos<=100;i++) 
		{
            		int divisores= 0;
            		int numeroActual=0;
            		
			for (int e=1;e<=i;e++) 
			{ 
                		numeroActual=e;
                		if ((i % e)==0) 
					divisores++;
            		}
		
			if (divisores==2) 
			{
				suma+=i;
				contadorPrimos++;
			}
			
		}

        	System.out.println (suma);
	}
}