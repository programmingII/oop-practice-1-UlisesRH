/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 05:47 pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio64_digitosencomun
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);/*creo un objeto de tipo scanner, e invoco a su constructor dandole como parametro el sistema estandar de entrada*/
        	
		System.out.print("Ingresa el primer numero: ");/*utilizo el metodo print, de la clase out para imprimir en pantalla*/
       		int x = entrada.nextInt();/*utilizo el metodo nexint del objeto creado de tipo scaner, y le asigno el valor a la variable primitiva int*/

		System.out.print("ingresa el segundo numero: ");
		int y = entrada.nextInt(); 

		if(x>=25 && y<=75)/*utilizo estructura de seleccion simple para ver el rango de los numeros*/
		{
			if(x%10==y%10)
				System.out.println("true");
		}
		else
		{
			System.out.println("Los numeros no estan entre el 25 y 75");
		}
	}
}
