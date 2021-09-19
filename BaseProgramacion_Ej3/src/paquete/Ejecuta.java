package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) 
	{
		/*
		    3. Programa que lee de manera consecutiva números hasta que se introducen dos números
			iguales seguidos.
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		int otroNumero;
		boolean continuar = true;
			
		
		System.out.println("Introduzca número");
		numero = sc.nextInt();
		
		do 
		{
			System.out.println("Introduzca número");
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