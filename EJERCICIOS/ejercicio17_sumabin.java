/*Nombre:Ulises Hernandez */
/*Dia: 10/02/2019 */
/*Hora: 8:31*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio17_sumabin
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
		String numero1,numero2;/* Aqui defino las variables que utilisare en string puesto que por lo que investige la mejor manera de lmacenr datos vinarios en java es mediante un string poruqe i lo almacenra con un formato de numero, ste reconoceria un numero concreto con signo, aparte de que existe una funcion para modificar el texto a un valor numerico*/
		int conver1,conver2,result;

		System.out.println("Ingrese el primer numero binario");
		numero1=entrada.nextLine();
		System.out.println("Ingrese el segundo numero binario");
		numero2=entrada.nextLine();

		conver1=Integer.parseInt(numero1,2);/*aqui llamo a la clase integer y su objeto parseint, el cual me convierte una cadena de texto a un valor numerico, el 2 lo agrege para que el sistema reconosca que la sumaes en base 2, osea en binario*/
		conver2=Integer.parseInt(numero2,2);
		result=conver1+conver2;
		
		String resultado=Integer.toString(result,2);/*aqui llamo a la clase integer y su objeto tostring el cual me devuelve en una cadena de texto el valor numerico almacenado, el 2 lo puse para que me lo devuelva en base 2*/
		
		System.out.println(resultado);
	}
}