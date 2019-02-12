/*Nombre:Ulises Hernandez */
/*Dia: 12/02/2019 */
/*Hora: 12:18 pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio26_octalabina
{
	public static void main(String[] args)
	{
		int octal;/*declaro variables del tipo primitivo entero*/
		String binario;

		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
     		System.out.println("Ingrese el numero en octal");
		octal=entrada.nextInt();/*Le asigno el valor que el ususario teclee a lavariable numero 1 por medio de la funcion nextInt del objeto entrada que previamente cree con la case scanner*/
		
		binario=Integer.toBinaryString(octal);/*Utilizo la clase integer y el objeto tobinarystring para convertir el valor de la variable que esta recibiendo como parametro y se onvierte en un string con el valor en binario*/

		System.out.println("El numero en binario es: "+binario);
	}
}