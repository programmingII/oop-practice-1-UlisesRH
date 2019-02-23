/*Nombre: Ulises Hernandez*/
/*Fecha:22/02/19*/
/*Hora: 05:32pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio55_seguhoras
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		
		System.out.println("Escriba los segundos");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int segundos=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		int hor=segundos/3600;/*declaro una variable de tipo primitivo int para guardar las horas*/
        	int min=(segundos-(3600*hor))/60;/*declaro una variable de tipo primitivo int para guardar los minutos*/
        	int seg=segundos-((hor*3600)+(min*60));/*declaro una variable primitiva int para guardar los segundos*/
        	System.out.println(hor+"h "+min+"m "+seg+"s");	
	}
}
