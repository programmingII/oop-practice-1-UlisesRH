/*Nombre:Ulises Hernandez*/
/*Fecha 15/02/2013*/
/*Hora 7:10*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio29_hextobina
{
	public static void main(String[] args)
	{
		String hexa;
		Scanner entrada=new Scanner(System.in);/*aqui llamo al constructor del scaner y le paso system in como parametro, por que este es el flujo de entrada. Esto se lo asigno a entrada y lo convierto del tipo scanner*/
		
		System.out.println("Escriba el numero hexadecimal");/*utilizo el metodo println para imprimir una linea de texto en cosola, el out es el flujo de salida estandar*/
		hexa=entrada.nextLine();/*le asigno a hexa el siguiente dato que el usurio ingrese mediante la funcion nextline() la cual captura un dato del teclado*/
		
		int numHex = Integer.parseInt(hexa, 16);/*utilizo el metodo parseint que pertenece  la clase ineger de java lang, el cual nos convierte una string en un numero con base 16*/
        	String binary = Integer.toBinaryString(numHex);/*utilizo el metodo to binary string el cual pertence a la clase integer y recibe como paramtero el mnumero que converti anteriormente, este sirve para onvertirlo en numero binario*/

		System.out.println("El numero en binario es"+ binary);
	}
}