/*Nombre:Ulises Hernandez */
/*Dia: 10/02/2019 */
/*Hora: 2:01*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio15_intercambiar
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		
		int numero1,numero2,intercambio;/*Defino 3 variables que son enteras*/

		System.out.println("Ingrese el primer valor");/*Ago uso del objeto system.out que es lo que representa una salida estandar*/
		numero1=entrada.nextInt();/*Le asigno el valor que el ususario teclee a lavariable numero 1 por medio de la funcion nextInt del objeto entrada que previamente cree con la case scanner*/

		System.out.println("Ingrese el segundo valor");/*Ago uso del objeto system.out que es lo que representa una salida estandar*/
		numero2=entrada.nextInt();/*Le asigno el valor que el ususario teclee a lavariable numero 1 por medio de la funcion nextInt del objeto entrada que previamente cree con la case scanner*/
		
		System.out.println("Los valores normales son: Numero 1= "+numero1+" Numero 2= "+numero2);/*Imprimo en pantalla los valores que el usuario escogio mediante el system.out.println*/

		intercambio=numero1;
		numero1=numero2;
		numero2=intercambio;

		System.out.println("Los valores intercambiados son: Numero 1= "+numero1+" Numero 2= "+numero2); 
	}
}