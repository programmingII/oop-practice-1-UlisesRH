/*Nombre:Ulises Hernandez */
/*Dia: 07/02/2019 */
/*Hora: 12:58*/

import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio11_radio/* */
{
	public static void main(String[] arg)
	{
		double radio,perimetro,area;/*Defini 3 variables double*/
		Scanner entrada=new Scanner(System.in);/*Creo un objeto de la clase scanner y como el dispositivo de etrada es el teclado pongo el system.in*/

		System.out.println("Ingrese el valor del radio");
		radio=entrada.nextDouble();/* llamo a la fucion next para capturar el doube del objeto creado entrada, este valor se lo asignamos a radio*/
		
		
		perimetro=2*Math.PI*radio;/* Llamo al objeto PI de la libreria math para multiplicarlos por el radio y el 2, para agregarle el resultado al perimetro*/
		area=Math.PI*radio*radio;/* */
		
		System.out.println("El perimetro es:"+ perimetro+",El radio es: "+radio);/* */

	}
}     