/*Nombre:Ulises Hernandez*/
/*Fecha 16/02/2013*/
/*Hora 4:35 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio32_comparar
{
	public static void main(String[] args)
	{
		int numero1,numero2;
		Scanner entrada=new Scanner(System.in);
		

		System.out.println("Ingrese el primer numero");
		numero1=entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2=entrada.nextInt();

		if(numero1<numero2)
			System.out.println(numero1+"<"+numero2);
		if(numero1>numero2)
			System.out.println(numero1+">"+numero2);
		if(numero1<=numero2)
			System.out.println(numero1+"<="+numero2);
		if(numero1>=numero2)
			System.out.println(numero1+">="+numero2);
		if(numero1==numero2)
			System.out.println(numero1+"="+numero2);
		if(numero1!=numero2)
			System.out.println(numero1+"!="+numero2);
		
	}	

}