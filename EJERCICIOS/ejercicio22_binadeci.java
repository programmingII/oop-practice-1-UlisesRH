/*Nombre:Ulises Hernandez */
/*Dia: 11/02/2019 */
/*Hora: 7:35 pm*/


import java.util.Scanner;/*Aqui llamo a la clase scanner que se encuentra en la libreria util*/

public class ejercicio22_binadeci
{
	public static void main(String[] args)
	{
     		boolean esBinario;/*declaro una variable bolean que utilizare para ver si el numero introducido es binario*/
		int decimal,exponente,digito,digito2,elevar,aux,numero;

     		Scanner entrada=new Scanner(System.in); declaro un nuevo objeto llamado entrada para el metodo de escanner*/

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

                		aux=aux/10;/*quito el ultimo numero para verificar el siguiente
           		}
      		}while(!esBinario); /*si el numero no es binario se pide un nuevo numero*/

      

		decimal=0;
		exponente=0;
     
      		while(numero>0)/*el proceso de cambio de binario a decimal*/
		{
            		digito2=numero%10;/*sACO EL ULTIMO DIGITO DE NUMERO*/
            		decimal=decimal+digito2*(int)Math.pow(2,exponente);/*CALCULO EL VALOR DEL DIGITO EN VALOR DECIMAL*/
            		numero/=10;
            		exponente++;
        	}

      		System.out.println("Decimal: " + decimal);
	}
}