/*Nombre:Ulises Hernandez */
/*Dia: 09/02/2019 */
/*Hora: 1:42*/


import java.util.Scanner;

public class ejercicio13_rectangulo
{
	public static void main(String[] args)
	{
		Scanner entrada=new Scanner(System.in);
		int base,altura,perimetro,area;

		System.out.println("Ingrese la base");
		base=entrada.nextInt();

		System.out.println("Ingrese la altura");
		altura=entrada.nextInt();
	
		perimetro=(base*2)+(altura*2);
		area=base*altura;

		System.out.println("El perimetro es "+perimetro);
		System.out.println("El area es "+area);

	}
}