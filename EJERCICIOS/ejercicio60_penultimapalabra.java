/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 04:34pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio60_penultimapalabra
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto del tipo scanner de la clase utl para utilizar sus metodos e invoco al constructor dandole como parametro la entrada del sistema*/

     		System.out.print("Ingresa la frase");/*utilizo el metodo print de la clase out, el cual me permite imprimir algo en el pantalla*/
	 	String frase=entrada.nextLine();

	 	String[] words =frase.split("[ ]+");/*utiliso el metodo split, de la clase string, este metodo me permite dividir una cadena de caracteres*/
	 	System.out.println("Penultimate word: "+words[words.length - 2]);
	}
}
