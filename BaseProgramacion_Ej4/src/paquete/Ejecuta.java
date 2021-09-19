package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) 
	{
		/*
		    3. Programa que lee de manera consecutiva números hasta que se introducen dos números
			iguales seguidos.
		 */

		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		int numero;
		int otroNumero;
		boolean continuar = true;
			
		// Pedimos el primer número antes del bucle
		System.out.println("Introduzca número");
		numero = sc.nextInt();
		
		do 
		{
			System.out.println("Introduzca número");
			otroNumero = sc.nextInt();

			// Si son iguales no continuamos
			if(numero==otroNumero) 
			{
				continuar = false;
			}
			// ...si son distintos
			else
			{
				// Pasamos el valor del último número introducido a la variable numero, 
				// para dejar libre la variable otroNumero y que pueda recoger el próximo valor 
				// en la siguiente iteración del bucle.
				numero = otroNumero;
			}
		}while( continuar==true );
		
		System.out.println("Fin");
		
		// Cerramos sc
		sc.close();
	}

}