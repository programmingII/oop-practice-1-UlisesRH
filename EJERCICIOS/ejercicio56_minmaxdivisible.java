/*Nombre: Ulises Hernandez*/
/*Fecha:22/02/19*/
/*Hora: 05:40pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio56_minmaxdivisible
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		
		System.out.println("Escriba el rango minimo");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int minimo=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		System.out.println("Escriba el rango maximo");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int maximo=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		System.out.println("Escriba el numero en el que tiene que ser divisible");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int divisible=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		if(minimo%divisible==0)/*utilizo la estructura de seleccion simple if para ver si el minimo es divisible*/
			System.out.println(maximo/divisible-minimo/divisible+1);/*si es de esta manera ejecuto la sentencia para imprimir el resultado*/
		System.out.println(maximo/divisible-minimo/divisible);	
	}
}
