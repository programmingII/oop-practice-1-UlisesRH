/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 07:06 pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio65_modulo
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);/*creo un objeto de tipo scanner, e invoco a su constructor dandole como parametro el sistema estandar de entrada*/
        	
		System.out.print("Ingresa el numero: ");/*utilizo el metodo print, de la clase out para imprimir en pantalla*/
       		int x = entrada.nextInt();/*utilizo el metodo nexint del objeto creado de tipo scaner, y le asigno el valor a la variable primitiva int*/

		System.out.print("ingresa el mod: ");/*utilizo el metodo print, de la clase out para imprimir en pantalla*/
		int y = entrada.nextInt(); 
		
		System.out.println(x-((x/y)*y));
	}
}
