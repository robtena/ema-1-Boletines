package Boletín2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribe un programa que determine si un año es bisiesto.
		Un año es bisiesto si es divisible por 4 pero no por 100,
		excepto si también es divisible por 400.*/
		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Introduce un año");
		
		int anio = sc.nextInt();
		
		boolean EsBisiesto;
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			
			EsBisiesto = true;
			
			System.out.println("El año "+anio+" es bisiesto");
			
		}else {
			
			EsBisiesto = false;
			
			System.out.println("El año "+anio+" no es bisiesto");
		}
		
		sc.close();
	}

}