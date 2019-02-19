/*Nombre:Ulises Hernandez*/
/*Fecha 18/02/2019*/
/*Hora 8:51 pm*/

import java.nio.charset.Charset;/*incluyo la paqueteria charset la cual permite trabajar con unicodes,digitos,caracteres etc*/

public class ejercicio40_digitosdisponibles
{
	public static void main(String[] args)
	{
		System.out.println("Caracteres:");  

    		for (String str:Charset.availableCharsets().keySet())/*utilizo el metodo availablecharacters para enlistar los caracteres canonicos, a esto le concateno el metodo keyset, el cual pertenece a la clase util de java, el cual devuelve la vista del conjuno de coas conteidas en el mapeado de charset.*/
		{
      			System.out.println(str);
    		}
	}
}