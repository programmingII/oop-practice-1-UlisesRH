/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 01:16pm*/


public class ejercicio50_divisibles
{
	public static void main(String[] args)
	{
		System.out.print("Divisibles entre 3: ");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				System.out.print(" "+i);
		}
		
		System.out.print("\n");
		System.out.print("Divisibles entre 5: ");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
				System.out.print(" "+i);
		}

		System.out.print("\nDivisibles entre 3 y 5:");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.print(" "+i);
		}
		
	}
}
