/*Nombre: Ulises Hernandez*/
/*Fecha:23/02/19*/
/*Hora: 05:40 pm*/

import java.util.Scanner;/*importo la clase scanner el cual me permite manejar los datos, recibiendolos en el sistema, esto viene del paquete util de java*/
public class ejercicio62_veinteomenos
{
	public static void main(String[] args)
	{
		Scanner entrada= new Scanner(System.in);/*creo un objeto de tipo scanner, e invoco a su constructor dandole como parametro el sistema estandar de entrada*/
        	System.out.print("Ingresa el primer numero: ");
       		int x = entrada.nextInt();  
		System.out.print("ingresa el segundo numero: ");
		int y = entrada.nextInt(); 
		System.out.print("Ingresa el tercer numero: ");
        	int z = entrada.nextInt(); 
        	System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));/*utilizo el metodo abs de la clase math, el cual me permite obtener el valor absoluto de una operacion*/
	
	}
}
