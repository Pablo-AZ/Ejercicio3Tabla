package es.studium.Ejemplo3Tabla;

import java.util.Scanner;

public class Ejemplo3Tabla
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[] = new int [TAM];
		float tabla2[] = new float [TAM];
		int i;
		Scanner teclado = new Scanner(System.in);
		
		
		for(i=0; i<TAM; i++) {
			
			System.out.println("Dame el valor de tabla ["+i+"]");
			tabla[i] = teclado.nextInt();
			
		}
		
		for (i=0; i<TAM; i++) {
			
			tabla2[i] = (float)tabla[i]/2;
			System.out.println(tabla2[i]);
			
		}
		teclado.close();
	}

}
