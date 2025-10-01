package Boletín2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa que lea un número entero y determine si es positivo, negativo o cero.*/
		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Dime un número");
		
		int num1 = sc.nextInt();
		
		if (num1<0) {
			
			System.out.println("El número es negativo");
		
		}else if (num1==0) {
			
			System.out.println("El número es cero");
			
		}else 
			System.out.println("El número es positivo");{
			
				
				sc.close();
		}
		
				
				
				
		

	}

}
