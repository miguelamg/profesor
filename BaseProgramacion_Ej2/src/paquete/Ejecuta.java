package paquete;

import java.util.Scanner;

public class Ejecuta 
{
	public static void main(String[] args) 
	{
		/*
		2. Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
		mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
		se hayan introducido 11 n�meros v�lidos y mostrar� el n�mero m�ximo introducido de los
		11 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
		*/
		
		// Declaramos las variables
		int numero;
		int contNumerosValidos = 0;
		int contErrores = 0;
		int maximo = 19;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		// Empleamos un bucle do while porque no sabemos cuantos n�meros vamos a necesitar pedir.
		do 
		{
			System.out.println("Introduzca n�mero:" );
			
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
		
		mensaje = "El m�ximo es " + maximo + " \n"
				+ "No han sido v�lidos " + contErrores + " n�meros";
		
		System.out.println(mensaje);
		
		sc.close();
	}
}
