/*Nombre: Ulises Hernandez*/
/*Fecha:24/02/19*/
/*Hora: 11:02pm*/


public class ejercicio69_lamitad
{
	public static void main(String[] args)
	{
		String str1="Python";/*declaro una variable como string y la creo con nu string literal*/
		String str2=str1.substring(0, str1.length()/2);/*utilizo el metodo substring del objeto string, para extraer ciertos caracteres, dentro utilizo el metodo length para saberla medida de lstring y poder recuperar los caracteres deseados*/

		System.out.println(str2);
	}
}
