/*Nombre:Ulises Hernandez */
/*Dia: 07/02/2019 */
/*Hora: 1:20*/

import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio12_promedio/* */
{
	public static void main(String[] arg)
	{
		double cont=0;/*Declaro una variable double*/
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/

		System.out.println("Ingrese los 3 numeros enteros");
		
		for(int i=0;i<3;i++)/*Creo una estructura for para pedir los 3 numeros al usuario*/
		{
			cont+=entrada.nextInt();/*Le sumo a la variabl cont lo que el usuario ingrese por el teclado y le agrego el resultado a la misma variable*/	
		}	
		
		System.out.println("El promedio es"+cont/3);
	}
}  