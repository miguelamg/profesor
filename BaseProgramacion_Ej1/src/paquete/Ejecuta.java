package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		// 1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
		// ===============================================================================
		
		// Declaramos las variables
		int a;
		int b;
		String mensaje;
		Scanner sc;
		

		sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número A");
		a = sc.nextInt();
		
		System.out.println("Introduza el número B");
		b = sc.nextInt();
		
		if(a%b==0)
		{
			mensaje = b + " es divisor de " + a;
		}
		else
		{
			mensaje = String.format("%d NO es divisor de %d", b, a);
		}
		
		System.out.println( mensaje );
		
		sc.close();
	}
}