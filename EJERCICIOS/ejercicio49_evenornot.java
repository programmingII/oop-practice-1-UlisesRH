/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 01:16pm*/

import java.util.Scanner;
public class ejercicio49_evenornot
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese el numero");
		numero=entrada.nextInt();

		if(numero%2==0)
			System.out.println("1");	
		else
			System.out.println("0");
		
	}
}
