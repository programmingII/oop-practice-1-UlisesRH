/*Nombre: Ulises Hernandez*/
/*Fecha:24/02/19*/
/*Hora: 10:54pm*/


public class ejercicio68_ultimostres
{
	public static void main(String[] args)
	{
		String str1="Python 3.0";/*declaro una variable como string y la creo con nu string literal*/
		String str2=str1.substring(str1.length()-3, str1.length());/*utilizo el metodo substring del objeto string, para extraer ciertos caracteres, dentro utilizo el metodo length para saberla medida de lstring y poder recuperar los caracteres deseados*/

		System.out.println(str2+str2+str2+str2);
	}
}
