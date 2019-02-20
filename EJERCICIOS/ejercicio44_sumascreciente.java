/*Nombre: Ulises Hernandez*/
/*Fecha:19/02/19*/
/*Hora: 10:46 pm*/


import java.util.Scanner;/*importo la clase scanner que se encuentra en el paquete de java.util, la cual me permite leer diferentes tipos de datos*/
public class ejercicio44_sumascreciente
{
	public static void main(String[] args)
	{	
		Scanner entrada=new Scanner(System.in);/*creo un objeto para poder invocar los metodos de la clase scanner, mediante el system in represento el sistema de entrada*/
		
		System.out.println("Ingrese el digto");
		int valor=entrada.nextInt();/*utilizo un metodo del objeto creado y capturo el valor del teclad, para asignarlo a la variable valor*/ 

		System.out.printf("%d+%d%d+%d%d%d\n", valor,valor,valor,valor,valor,valor);
		
	}
}
