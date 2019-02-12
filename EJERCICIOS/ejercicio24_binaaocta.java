/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 10:36 pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio24_binaaocta
{
	public static void main(String[] args)
	{
     		boolean esBinario;/*declaro una variable bolean que utilizare para ver si el numero introducido es binario*/
		int decimal,contador,digito,digito2,elevar,aux,numero,i=1;
		int numerooctal[]=new int[30];/*inicializo un arreglo de enteros en los que guardare los numeros en octal*/

     		Scanner entrada=new Scanner(System.in); /*declaro un nuevo objeto llamado entrada para el metodo de escanner*/

     		do{
          		System.out.println("Introduce un numero binario: ");
          		numero=entrada.nextInt();
          	
          		esBinario=true;
          		aux=numero;

         		while(aux!=0) 
			{
				digito=aux%10;/*saco el ultimo digito del numero*/

                		if(digito!=0 && digito!=1) /*verifico que sea 0 o 1*/
				{ 
                        		esBinario=false; 
              			}

                		aux=aux/10;/*quito el ultimo numero para verificar el siguiente*/
           		}
      		}while(!esBinario); /*si el numero no es binario se pide un nuevo numero*/

      		contador=numero;
		
      		while(contador!=0)/*el proceso de cambio de binario a octal*/
		{
			numerooctal[i++]=contador%8;/*reviso el numero de la cadena en octal y le saco el mod 8 para sacar su numero en octal*/
			contador=contador/8;/*eliminio el numero que analize previamente*/
        	}

      		System.out.print("Numero en octal: ");

        	for(int j=i-1;j>0;j--)/*recorro la cadena para imprimir los numeros almacenados*/
        	{
            		System.out.print(numerooctal[j]);
        	}
	}
}