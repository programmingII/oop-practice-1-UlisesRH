/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 04:12pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio52_sumas
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		
		System.out.println("Escriba La varible 1");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int variable1=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		System.out.println("Escriba La varible 2");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int variable2=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextint, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		System.out.println("Escriba La varible 3");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int variable3=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextint, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		if(variable1+variable2==variable3)
			System.out.println("True");	
	}
}
