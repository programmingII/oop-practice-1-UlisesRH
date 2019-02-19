/*Nombre:Ulises Hernandez*/
/*Fecha 18/02/2019*/
/*Hora 8:05 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio38_contadores
{
	public static void main(String[] args)
	{	
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la calse scanner(entrada) y lo asocio al dispositivo de entrada(teclado) con el system.in*/
		String oracion;/*utilizo el tipo string el cual representa una secuencia de caracteres*/
	
		System.out.println("Ingrese la oracion");
		oracion=entrada.nextLine();/*mediante la funcion nextline del objeto creado de la calse scanner capturo un dato*/

		char[] matriz =oracion.toCharArray();/*utilizo un metodo de la clase string, al tener oracion definido como un string no nesesito crear un objeto de clase string*/
		int letras=0;
		int espacios=0;
		int numeros=0;
		int otros=0;

		for(int i=0;i<oracion.length();i++)/*el metodo length pertenece a la clase string, este metodo nos permite determinar el largo de un string en valor numerico*/
		{
			if(Character.isLetter(matriz[i]))/*La clase caracter, es una clase incluida en java lang, la cual nos permite encapsular el digito que se encuentre en el array, para poder manipularlo, en este caso utilizo el metodo is letter el cual determina si el objeto es una letra*/
			{
				letras++;
			}
			else if(Character.isDigit(matriz[i]))
			{
				numeros++;
			}
			else if(Character.isSpaceChar(matriz[i]))
			{
				espacios++;
			}
			else
			{
				otros++;
			}
		}

		System.out.println("Letras "+letras+"\nEspacios "+espacios+"\nNumeros "+numeros+"\nOtros "+otros);
	}	

}