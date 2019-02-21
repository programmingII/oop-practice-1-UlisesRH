/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 12:29 pm*/

import java.io.File;/*importo la clase file, el cual trabaja de manera abstracta con la ruta de los directoiros, esta derivada de io que trabaja con flujo de datos*/
public class ejercicio45_tamano
{
	public static void main(String[] args)
	{	
		String fichero= "D:\\parimpar.java";/*declaro una variable de tipo string y le asigmno la ruta del directorio*/
    		File ficheroT = new File(fichero);/*creo un objeto de tipo File, y la inicializo para poder usar sus metodos*/

		System.out.println("El tamano es:"+fichero.length()+" bytes");/*utilizo el metodo length, del objeto que cree de tipo file para imprimir el tamano del archivo*/
	}
}
