package Boletín2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pide al usuario dos números enteros y
		 muestra cuál de los dos es mayor o si son iguales.*/
		
		Scanner sc = new Scanner (System.in);
		
		int num1,num2;
		
		System.out.println("Introduce el primer número");
		
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		
		num2=sc.nextInt();
		
		
		if (num1>num2) {
			System.out.println("El número "+num1+" es mayor que el "+num2);
			
		}else if (num2==num1) {
			System.out.println("El número "+num1+ " es igual que el "+num2);
		
			
		}else {
			System.out.println("El número "+num2+" es mayor que el "+num1);

			
			sc.close();
			
		
			

		
		
		
		

	}

}}