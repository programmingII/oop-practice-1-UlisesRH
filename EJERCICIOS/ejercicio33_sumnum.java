/*Nombre:Ulises Hernandez*/
/*Fecha 16/02/2013*/
/*Hora 4:45 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio33_sumnum
{
	public static void main(String[] args)
	{
		int num,aux,resultado;/* utilizo el tipo primitivo int para instanciar */	
		Scanner entrada=new Scanner(System.in);/*creo un objeto llamado entrada para que herede los metodos de la clase scanner*/

		System.out.println("Ingrese el numero: ");
		num=entrada.nextInt();
		aux=num;

		resultado=0;

		while(num!=0)
		{
			resultado+=num%10;
			num/=10;
		}

		System.out.println("La suma entre los digitos de "+aux+" es: "+resultado);/*utilizo el println del metodo out y concateno una variable a la impresion en panatalla*/	
	}	

}