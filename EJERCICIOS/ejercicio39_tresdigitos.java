/*Nombre:Ulises Hernandez*/
/*Fecha 18/02/2019*/
/*Hora 8:25 pm*/


public class ejercicio39_tresdigitos
{
	public static void main(String[] args)
	{
		int cantidad= 0;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				for(int k = 1; k <= 4; k++)
				{
					if(k != i && k != j && i != j)
					{
						cantidad++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}

		System.out.println("El total es: "+cantidad);
	}
}