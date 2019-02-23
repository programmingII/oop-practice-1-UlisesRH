/*Nombre: Ulises Hernandez*/
/*Fecha:22/02/19*/
/*Hora: 09:45pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio58_mayusculas
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner y lo inicializo para poder usar sus metodos*/
		
		System.out.println("Ingrese la frase");/*utilizo println para imprimir un mensaje en pantalla,derivado de out el cual es la salida estandar del sistema*/
		String dato=entrada.nextLine();/*utilizo el objeto de tipo scanner para invocar al metodo nextLine, esto se lo asigno a la variable para guardar lo introducido por el ususario*/
		
		StringBuilder nuevaFrase= new StringBuilder(dato);/* creo un objeto del tipo stringbuilder de la clase lang, invoco al constructor dandole como parametro el dato de entrada del usuario*/
		int i=0;
		do 
		{
  			nuevaFrase.replace(i,i+1,nuevaFrase.substring(i,i+1).toUpperCase());/*utilizo los metodos de la clase con el objeto creado, utilizo el mtodo replace el cual crea un string con el contenido remplazado,el primer campo es donde empieza, el segundo en donde termina y el tercero lo que debe de remplazar,aqui utilizo el substring el cual me genera un nuevo string con el contenido substraido, el primer campo es donde empieza y el segundo donde termina y substra esos campos, estos son metodos de la clase stringbuilder*/
  			i =nuevaFrase.indexOf(" ", i) + 1;/*indexof es un metodo del objeto creado, de la clase stringbuilder, este lo ocupo recibiendo el parametro, de lo que debe encontrar y desde donde empieza*/
		}while (i>0&&i<nuevaFrase.length());

		System.out.println(nuevaFrase.toString());
	}
}
