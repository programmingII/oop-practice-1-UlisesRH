/*Nombre:Ulises Hernandez*/
/*Fecha 14/02/2019*/
/*Hora 7:15 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio36_cordenadas
{
	public static void main(String[] args)
	{	
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la calse scanner(entrada) y lo asocio al dispositivo de entrada(teclado) con el system.in*/
	
		System.out.println("Ingrese la latitud 1");/*Utlizo el println el del metodo out, que es el metodo de salida estandar de java, de la clase system*/
		double lat1 =entrada.nextDouble();
		System.out.println("Ingrese la longitud 1");
		double lon1 =entrada.nextDouble();
		System.out.println("Ingrese la latitud 2");
		double lat2 =entrada.nextDouble();
		System.out.println("Ingrese la longitud 2");
		double lon2 =entrada.nextDouble();

		lat1 = Math.toRadians(lat1);/*Le asigno a la variable, el parametro que recibe la funcion toradians, el cual convierte los valores a radianes,este metodo pertenece a la clase math, la cual es la clase de java de uso matematico*/
        	lon1 = Math.toRadians(lon1);
        	lat2 = Math.toRadians(lat2);
        	lon2 = Math.toRadians(lon2);

		double earthRadius = 6371.01;
		earthRadius=earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));/*En esta parteutilizo muchos metodos de la clase math, todos ellos de utilizacion matematica los cuales me convierten los valores que las fuciones reciben como paramaetro en el valor de la funcion, como senai, coseno*/
    		
		System.out.println("La distancia entre puntos es "+earthRadius);
		
	}	

}