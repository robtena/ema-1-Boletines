package Boletín1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 10
		  Escribir una aplicación que indique cuántas cifras tiene un número entero,
		  introducido por teclado, que estará comprendido entre 0 y 99999*/
		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Introduce un número");
		
		int num1 = sc.nextInt();
		
		if (num1>0 && num1<10) {
			System.out.println("El número tiene 1 cifra");
		
		}else if (num1>=10 && num1<100){
			System.out.println("El número tiene 2 cifras");
			
		}else if (num1>99 && num1<999) {
			System.out.println("El número tiene 3 cifras");
		}else if (num1>999 && num1<9999) {
			System.out.println("El número tiene 4 cifras");
			
		}else if (num1>9999 && num1<=99999) {
			System.out.println("El número tiene 5 cifras");
			
		}else {
			System.out.println("El número es demasiado grande para este software");
			
		
			
		}
		
		
		sc.close();
		

	}

}
