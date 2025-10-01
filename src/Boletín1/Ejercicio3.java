package Boletín1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 3:
		 * Escribir un programa que pida un número al usuario e indique mediante
		  un literal booleano  si el número es par*/
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime un número");
		
		int num = sc.nextInt();
		
		boolean esPar = (num % 2 ==0); //Un boolean siempre me va a devolver un true o un false
			System.out.println(esPar);
	
		
			sc.close();
		
	}

}