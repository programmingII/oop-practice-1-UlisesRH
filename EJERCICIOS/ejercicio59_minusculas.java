/*Nombre: Ulises Hernandez*/
/*Fecha:22/02/19*/
/*Hora: 10:20pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio59_minusculas
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto del tipo scanner de la clase utl para utilizar sus metodos e invoco al constructor dandole como parametro la entrada del sistema*/

     		System.out.print("Ingresa la frase");
	 	String frase=entrada.nextLine();

	 	frase=frase.toLowerCase();/*utilizo un metodo de la clase string, el cual me permite pasar letras a minusculas*/
	 	System.out.println(frase); 
	}
}
