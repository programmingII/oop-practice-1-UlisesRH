/*Nombre:Ulises Hernandez */
/*Dia: 12/02/2019 */
/*Hora: 10:34 am*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio25_octaladeci
{
	public static void main(String[] args)
	{
		int numoctal,aux,resultado=0;/*declaro variables del tipo primitivo entero*/

		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/
     		System.out.println("Ingrese el numero en octal");
		
		numoctal=entrada.nextInt();
		aux=numoctal;
		int i=0;

		while(numoctal!=0)
        	{
        	    	resultado=resultado+(numoctal%10)*(int)Math.pow(8,i);/*Asigno a resultado el valor del ultimo digitoy saco su equivalente en decimal,utilizo el int para que sea tomado como un numero el resultado del exponente*/
            		i++;
            		numoctal=numoctal/10;/*quito el ultimo digito del numero octal*/
        	}
		
		System.out.println("El numero en decimal es:"+ resultado);
	}
}