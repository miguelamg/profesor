package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) 
	{
		/*
		    3. Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
			iguales seguidos.
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		int otroNumero;
		boolean continuar = true;
			
		
		System.out.println("Introduzca n�mero");
		numero = sc.nextInt();
		
		do 
		{
			System.out.println("Introduzca n�mero");
			otroNumero = sc.nextInt();

			if(numero==otroNumero) 
			{
				continuar = false;
			}
			else
			{
				numero = otroNumero;
			}
		}while( continuar==true );
		
		System.out.println("Fin");
		
		sc.close();
	}

}