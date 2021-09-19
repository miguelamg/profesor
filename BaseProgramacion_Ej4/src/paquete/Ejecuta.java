package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) 
	{
		/*
		    3. Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
			iguales seguidos.
		 */

		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numero;
		int otroNumero;
		boolean continuar = true;
			
		// Pedimos el primer n�mero antes del bucle
		System.out.println("Introduzca n�mero");
		numero = sc.nextInt();
		
		do 
		{
			System.out.println("Introduzca n�mero");
			otroNumero = sc.nextInt();

			// Si son iguales no continuamos
			if(numero==otroNumero) 
			{
				continuar = false;
			}
			// ...si son distintos
			else
			{
				// Pasamos el valor del �ltimo n�mero introducido a la variable numero, 
				// para dejar libre la variable otroNumero y que pueda recoger el pr�ximo valor 
				// en la siguiente iteraci�n del bucle.
				numero = otroNumero;
			}
		}while( continuar==true );
		
		System.out.println("Fin");
		
		// Cerramos sc
		sc.close();
	}

}