/*Nombre: Ulises Hernandez*/
/*Fecha:22/02/19*/
/*Hora: 09:45pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio57_factorial
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		
		System.out.println("Escriba el numero");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		int dato=entrada.nextInt();/*utilizo el objeto de tipo scanner para invocar al metodo nextInt, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		int ctr = 0;/*creo una variable de ltipo primitivo entero*/
        	for(int i=1; i<=(int)Math.sqrt(dato); i++) /*utilizo una estructura de control for para recorrer todos los numeros desde el 1 hasta la raiz del ingresado, utilizo el int antes de math.sqrt para convertir el numero en un etero, y utilizo el metodo sqrt de la clase math para la raiz*/
		{
            		if(dato%i==0 && i*i!=dato) /*utilizo una estructura de seleccion simple if, para ir descartando los no factoriales*/
			{
                		ctr+=2;
            		} 
			else if(i*i==dato) 
			{
                		ctr++;
            		}
        	}

		System.out.println(ctr);/*imprimo el resultado de cuantos numeros hay*/
	}
}
