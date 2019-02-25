/*Nombre: Ulises Hernandez*/
/*Fecha:24/02/19*/
/*Hora: 10:46pm*/


public class ejercicio67_stringdentrodeotro
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Python 3.0");/*creo nu objeto de tipo stringbuffer el cual es una clase gemela de string que permite la manipulacion de cadenas, recibe de parametro un string para crear esa cadena*/ 
		sb.insert(6, " Tutorial ");/*utilizo un metodo del objeto creado, el metodo insert sirve para insertar un string en un determinado lugar*/

		System.out.println(sb.toString());/*utilizo out.println que es el output standar, yle doy de parametro el objeto creado que es la cadena almacenada con el metodo tostring para que lo imprima como string*/
	}
}
