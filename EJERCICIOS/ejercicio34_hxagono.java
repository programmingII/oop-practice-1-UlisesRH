/*Nombre:Ulises Hernandez*/
/*Fecha 17/02/2019*/
/*Hora 6:50 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio34_hxagono
{
	public static void main(String[] args)
	{	
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la calse scanner(entrada) y lo asocio al dispositivo de entrada(teclado) con el system.in*/

        	System.out.println("Ingrese el largo de un lado: ");/*utilizo el println de la clase system, derivado de out el cual es el flujo de salida estandar*/
        	double largo=entrada.nextDouble();/*inicializo una varible y le asigno el valor que el ususario metera por teclado con la funcion nextdouble del objeto creado entrada*/

        	System.out.println("Area: "+(6*(largo*largo))/(4*Math.tan(Math.PI/6)));
    
	}	

}