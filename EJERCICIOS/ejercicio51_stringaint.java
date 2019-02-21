/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 04:00pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio51_stringaint
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		String variable;/*declaro una variable de tipo string*/

		System.out.println("Escriba el numero");/*utilizo println para imprimir un mensaje n pantalla,derivado de out el cual es la salida estandar del sistema*/
		variable=entrada.nextLine();/*utilizo el objeto de tipo scanner para invocar al metodo nextline, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		System.out.println("El numero es"+Integer.parseInt(variable));	
	}
}
