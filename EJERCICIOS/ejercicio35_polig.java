/*Nombre:Ulises Hernandez*/
/*Fecha 17/02/2013*/
/*Hora 6:37 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio35_polig
{
	public static void main(String[] args)
	{	
		long lado;/*Declaro el tipo de dato primitivo long para las variables*/
		double longitud;
		Scanner entrada=new Scanner(System.in);/*creo un objeto de tipo scanner para poder utilizar sus metodos con el nombre de entrada*/
		
		System.out.println("Ingrese el numero de lados del polygono");
		lado=entrada.nextLong();/*igualo una variable alo que el ususario introdusca, mediante el metodo nextlong del objeto que cree con nombre entrada*/
		
		System.out.println("Ingrese la longitud");
		longitud=entrada.nextLong();
		
		System.out.println("El resultado es: "+(lado*(longitud*longitud))/(4.0*Math.tan((Math.PI/lado))));/*utilizo tan, de la clase math que se encuentra en java lang, de la misma manera el pi, mathes una clase de operaciones matematicas*/
	}	

}