/*Nombre: Ulises Hernandez*/
/*Fecha:21/02/19*/
/*Hora: 01:00 pm*/

import java.text.SimpleDateFormat;/*importo text.simpledateformat, el .text me proporciona clases e intefaces para manejar la informacion date, el simpledateformat, me permite "formatear" el date, es decir manipularlo de cualquier manera*/
import java.util.Date;/*importo la clase Date el cual maneja datos de tiempo, esta se deriva de util*/

public class ejercicio47_dateFormat
{
	public static void main(String[] args)
	{
		SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");/*creo un objeto de simpledete format, y lo inicializo apra que obtenga sus metodos/
		Date date=new Date();/*creo un objeto de tipo date para usar sus metodos*/

		System.out.println(formato.format(date));/*utilizo el objeto creado de simpledate, y utilizo el metodo format, anteriormente definido, recibiendo como parametro date es cual es el objeto creado de la clase Date*/
	}
}
