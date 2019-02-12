/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 7:26 pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio21_deciaocta
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		
		int numero1;/*declaro una variable como entera para almacenar el valor que introduce el usuario*/

		System.out.println("Ingrese el numero en decimal");
		numero1=entrada.nextInt();

		System.out.println(Integer.toOctalString(numero1));/*devuelve una representación de cadena del argumento entero como un entero sin signo en base 8*/
	}
}