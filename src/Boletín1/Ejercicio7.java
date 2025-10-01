package Boletín1;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 7:
Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
Se quiere mostrar como resultado final: “es par” o “es impar”*/
		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Introduce tu número");
			
		int num1 = sc.nextInt();
		
		if (num1 % 2 ==0) {
			System.out.println("Es par");
			
		} else {
			System.out.println("Es impar");
			
			sc.close();
		}
		
			
		
			
		
		
		
		
		

	}

}
