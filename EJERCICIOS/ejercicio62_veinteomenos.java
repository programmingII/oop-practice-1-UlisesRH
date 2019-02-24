/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 05:05pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio62_veinteomenos
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);/*creo un objeto del tipo scanner de la clase utl para utilizar sus metodos e invoco al constructor dandole como parametro la entrada del sistema*/
		
     		System.out.print("Ingresa el numero ");/*utilizo el metodo print de la clase out, el cual me permite imprimir algo en el pantalla*/
	 	int numero1=entrada.nextInt();/*utilizo el objeto creado de tipo scanner para usar el metodo de ingreso de datos, y guardo ese dato en la variable numero1*/
		
		System.out.print("Ingresa el numero ");/*utilizo el metodo print de la clase out, el cual me permite imprimir algo en el pantalla*/
	 	int numero2=entrada.nextInt();/*utilizo el objeto creado de tipo scanner para usar el metodo de ingreso de datos, y guardo ese dato en la variable numero1*/
		
		System.out.print("Ingresa el numero ");/*utilizo el metodo print de la clase out, el cual me permite imprimir algo en el pantalla*/
	 	int numero3=entrada.nextInt();/*utilizo el objeto creado de tipo scanner para usar el metodo de ingreso de datos, y guardo ese dato en la variable numero1*/
			
		
		if((Math.abs(numero1-numero2)>=20 || Math.abs(numero2-numero3)>=20 || Math.abs(numero3-numero2)>=20))/*utilizo una estructura de seleccion simple if para verificar si las restas dan mas de 20, utilizo el metodo abs, de la clase math el cual me da el valor absoluto de las operaciones*/
			System.out.println("True");

		System.out.println("False");
	}
}
