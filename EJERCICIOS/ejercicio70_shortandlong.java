/*Nombre: Ulises Hernandez*/
/*Fecha:25/02/19*/
/*Hora: 11:31 am*/


public class ejercicio70_shortandlong
{
	public static void main(String[] args)
	{
		String str1="Python";/*declaro una variable como string y la creo con un string literal*/
		String str2="PythonPuls";/*declaro una variable como string y la creo con un string literal*/
		
		if(str1.length()>str2.length())/*utilizo un meodo de seleccion simple if para ver cual es el string mas chico, pra eso utilizo e metodo length de la clase string de cada objeto creado como un string*/
			System.out.println(str2+str1+str2);
		else
			System.out.println(str1+str2+str1);
		
	}
}
