/*Nombre:Ulises Hernandez */
/*Dia: 07/02/2019 */
/*Hora: 12:11*/

import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio7_tabla /* */
{
	public static void main(String[] arg)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		int numero;/*declaro una variable entera llamada numero*/

		System.out.println("Ingrese el numero para su tabla de multiplicar");/*imprimo en pantalla el mensaje entre comillas*/
		numero=entrada.nextInt();/*llamo a la funcion nexint de entra que es el objeto creado, y se le asigna a numero puesto que tomara el valor que el usuario introdusca*/

		for(int i=1;i<=10;i++)/*utilizo la estructura de control for para hacer un ciclo de tabla de multiplicar*/
		{
			System.out.println(numero+"*"+i+"="+numero*i);/*Imprimo en pantalla los numeros que se multiplican con su resultado*/
		}
	}
}                                                     