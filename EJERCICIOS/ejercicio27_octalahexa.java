/*Nombre:Ulises Hernandez */
/*Dia: 12/02/2019 */
/*Hora: 12:pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio27_octalahexa
{
	public static void main(String[] args)
	{
		String octal,hexadecimal;/*declaro variables del tipo primitivo entero*/
		int decimal;

		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
     		System.out.println("Ingrese el numero en octal");

		octal=entrada.nextLine();/*Le asigno el valor que el ususario teclee a lavariable numero 1 por medio de la funcion nextInt del objeto entrada que previamente cree con la case scanner*/
		
		decimal=Integer.parseInt(octal,8);
		hexadecimal=Integer.toHexString(decimal);
		
		System.out.println("El numero en hexadecimal es:" +hexadecimal);
		
	}
}