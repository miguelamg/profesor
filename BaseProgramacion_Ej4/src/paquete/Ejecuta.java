package paquete;

import java.util.Scanner;

public class Ejecuta 
{
	public static void main(String[] args) 
	{
		/*
		 4. Programa que muestra todos los divisores de un número introducido. 
		    Entre los divisores no se incluirá el propio número.
		*/

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca número:");
		numero = sc.nextInt();

		//for(int candidatoDivisor=1; candidatoDivisor<=numero/2; candidatoDivisor++) {
		for(int candidatoDivisor=1; candidatoDivisor<numero; candidatoDivisor++) {
			if( numero%candidatoDivisor == 0) 
			{
				System.out.println(candidatoDivisor);
			}
		}
		
		sc.close();
	}
}