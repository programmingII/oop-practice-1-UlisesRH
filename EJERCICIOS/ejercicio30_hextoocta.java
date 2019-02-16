/*Nombre:Ulises Hernandez*/
/*Fecha 15/02/2013*/
/*Hora 9:48 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio30_hextoocta
{
	public static void main(String[] args)
	{
		String hexa;
		int decimal,i,j;
		int octnum[]=new int[50];/* defino una cadena de caracteres */
		Scanner entrada=new Scanner(System.in);/*aqui llamo al constructor del scaner y le paso system in como parametro, por que este es el flujo de entrada. Esto se lo asigno a entrada y lo convierto del tipo scanner*/
		
		System.out.println("Escriba el numero hexadecimal");/*utilizo el metodo println para imprimir una linea de texto en cosola, el out es el flujo de salida estandar*/
		hexa=entrada.nextLine();/*le asigno a hexa el siguiente dato que el usurio ingrese mediante la funcion nextline() la cual captura un dato del teclado*/
		
		
		String digitos="0123456789ABCDEF";/*agrego los digitos del hexadecimal*/
		
		hexa=hexa.toUpperCase();/*touppercase pertenece a al libreria de string,esto nos permite conviertir todos los caracteres de la cadena a mayusculas*/
		int val=0;
		
		for(i=0;i<hexa.length();i++)/*utilizo el metodo length() de la libreria string que nos permite medir la longitus de una cadena*/
		{
			char c=hexa.charAt(i);/*chartat pertenece a la clase string,este retorna el caracter especificado en el índice. Un índice está en el rango de 0 a la longitud del string menos 1.*/
                 	int d=digitos.indexOf(c);/*indexof pertenece a la clase string y este nos devuelve el indice dentro del objto string al que realize la llamda*/
                 	val=16*val + d;
		}

		decimal=val;
		i=1;
		while(decimal!=0)
		{
			octnum[i++]=decimal%8;
			decimal=decimal/8;
		}
		
		System.out.println("El numero en octal es: ");
		
		
		for(j=i-1;j>0;j--)
		{
			System.out.print(octnum[j]);
		}

	}	

}