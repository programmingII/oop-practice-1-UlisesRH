/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 9:01*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio19_deciabin
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		
		int numero1;

		System.out.println("Ingrese el nmumero en decimal");
		numero1=entrada.nextInt();

		System.out.println(Integer.toBinaryString(numero1));
	}
}