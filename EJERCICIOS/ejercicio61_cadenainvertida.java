/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 04:51pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio61_cadenainvertida
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto del tipo scanner de la clase utl para utilizar sus metodos e invoco al constructor dandole como parametro la entrada del sistema*/
		String cadenaInvertida="";
     		System.out.print("Ingresa la frase");/*utilizo el metodo print de la clase out, el cual me permite imprimir algo en el pantalla*/
	 	String frase=entrada.nextLine();/*utilizo el objeto creado de tipo scanner para usar el metodo de ingreso de daots, y guardo ese dat oen la variable frase*/
		
		for (int x=frase.length()-1;x>=0;x--)/*utilizo una estructura de control for, para recorrer la cadena desde la ultima letra,utilizo el metodo length() de la clase string, del objeto frase, para encontrar el tamano de la frase*/
    			cadenaInvertida=cadenaInvertida+frase.charAt(x);/*utilizo el metodo charat, del objeto frase para guardar cada caracter*/
	 	
		System.out.println(cadenaInvertida);	
	}
}
