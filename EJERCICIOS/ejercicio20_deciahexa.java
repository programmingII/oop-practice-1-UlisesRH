/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 9:15*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio20_deciahexa
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		
		int numero1;/*declaro una variable como entera para almacenar el valor que introduce el usuario*/

		System.out.println("Ingrese el numero en decimal");
		numero1=entrada.nextInt();

		System.out.println(Integer.toHexString(numero1).toUpperCase());/*utilizo en metdo tohexstring que me permite retornar un string con el valor del hexadecimal del valor del parametro que se introducio, y utilizo el metodo touppercase para poner en mayusculas todas las letras */
	}
}