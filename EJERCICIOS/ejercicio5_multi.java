/*Ulises Hernandez 01:10*/

import java.util.Scanner;

public class ejercicio5_multi
{
	public static void main(String[] args)
	{
		int numero1;
		int numero2;
		Scanner digito= new Scanner(System.in);
		System.out.println("Digite un numero entero");
		numero1=digito.nextInt();
		System.out.println("Digite un numero entero");
		numero2=digito.nextInt();
		System.out.println(numero1+"*"+numero2+"="+numero1*numero2);
	}
}