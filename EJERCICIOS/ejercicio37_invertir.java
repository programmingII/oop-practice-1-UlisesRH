/*Nombre:Ulises Hernandez*/
/*Fecha 17/02/2019*/
/*Hora 7:05 pm*/


import java.util.Scanner;/*utilizo la clase util que contiene el metodo scanner, este metodo nos permite analizar tipos y caednas primitivas usando expresiones regulares*/

public class ejercicio37_invertir
{
	public static void main(String[] args)
	{	
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la calse scanner(entrada) y lo asocio al dispositivo de entrada(teclado) con el system.in*/
		String oracion;/*utilizo el tipo string el cual representa una secuencia de caracteres*/
	
		System.out.println("Ingrese la oracion");
		oracion=entrada.nextLine();/*mediante la funcion nextline del objeto creado de la calse scanner capturo un dato*/

		StringBuilder builder=new StringBuilder(oracion);/*aqui contruyo un generador de cadenas con un string especifico con el new string builder, esto selo asigno a biulder que es un objeto de la clase string builder*/
    		String invertir=builder.reverse().toString();/*utilizo el reverse, para invertir la cadena sobrecargada, y le aplico el metodo tostring de la clase string para convertilo en un strin*/

		System.out.println(invertir);
	}	

}