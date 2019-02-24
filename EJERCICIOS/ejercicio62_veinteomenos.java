/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 05:10 pm*/

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
		
		System.out.println(resultado(numero1,numero2));
	}

	public static int resultado(int a,int b)
	{
		if(a==b)
			return 0;
		
		if(a%6==b%6)
			if(a>b)
				return b;
			else
				return a;	

		if(a>b)
			return a;
		else
			return b;
			
	
	}
}
