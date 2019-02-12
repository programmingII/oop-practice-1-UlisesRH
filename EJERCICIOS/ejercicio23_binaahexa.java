/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 10:15 pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio23_binaahexa
{
	public static void main(String[] args)
	{
     		boolean esBinario;/*declaro una variable bolean que utilizare para ver si el numero introducido es binario*/
		int decimal,exponente,digito,digito2,elevar,aux,numero;
 		String hexdecnum="";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

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

      

		decimal=0;
		exponente=0;
     
      		while(numero>0)/*el proceso de cambio de binario a decimal*/
		{
			digito2=numero%16;
            		hexdecnum=hex[digito2]+hexdecnum;
            		numero=numero/16;
        	}

      		System.out.println("Hexadecimal: " + hexdecnum);
	}
}