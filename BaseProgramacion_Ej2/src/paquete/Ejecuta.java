package paquete;

import java.util.Scanner;

public class Ejecuta 
{
	public static void main(String[] args) 
	{
		/*
		2. Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
		11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		*/
		
		// Declaramos las variables
		int numero;
		int contNumerosValidos = 0;
		int contErrores = 0;
		int maximo = 19;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		// Empleamos un bucle do while porque no sabemos cuantos números vamos a necesitar pedir.
		do 
		{
			System.out.println("Introduzca número:" );
			
			try 
			{
				numero = Integer.valueOf( sc.nextLine() );
				
				if(numero<20 || numero>40) 
				{
					System.out.println("Fuera de rango. Debe estar comprendido entre 20 y 40.");
					contErrores++;
				}
				else 
				{
					contNumerosValidos++;
					if(numero>maximo) 
					{
						maximo = numero;
					}
				}			
			}
			catch(NumberFormatException e)
			{
				System.out.println("Formato incorrecto.");
			}

		}while(contNumerosValidos<3); // indicamos 3 en lugar de 11 para abreviar el ejercicio.
		
		mensaje = "El máximo es " + maximo + " \n"
				+ "No han sido válidos " + contErrores + " números";
		
		System.out.println(mensaje);
		
		sc.close();
	}
}
