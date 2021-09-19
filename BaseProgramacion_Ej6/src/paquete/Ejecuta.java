package paquete;
import java.util.Scanner;

public class Ejecuta 
{
	public static void main(String[] args) 
	{
		/*
		   6. Programa que lee 9 números, y en el caso en el que el primero 
		   introducido sea igual al último, nos muestra la media. 
		   En caso contrario, no se mostrará nada.
		 */

		// Declaramos las variables
		int suma;
		float media;
		int numeroPrimero;
		int numeroUltimo = 0;
		final int CANTIDAD_NUMEROS = 3; // Para ahorrar tiempo, probamos con 3 números en lugar de 9.
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca número: ");
		numeroPrimero = sc.nextInt();
		suma = numeroPrimero;
		
		for(int i=2; i<=CANTIDAD_NUMEROS; i++) 
		{
			System.out.println("Introduzca número: ");
			numeroUltimo = sc.nextInt();
			
			suma+=numeroUltimo;
		}
		
		if( numeroPrimero==numeroUltimo ) 
		{
			media = suma/(float)CANTIDAD_NUMEROS;
			// mensaje = "La media vale " + media;
			mensaje = String.format("La media vale %.2f", media);
			
			System.out.println(mensaje);
		}
		
		sc.close();
	}
}