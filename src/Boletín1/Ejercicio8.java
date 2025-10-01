package Boletín1;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 8
		Solicitar dos números enteros y mostrar cuál es el mayor.*/
		
		Scanner sc = new Scanner (System.in);
			System.out.println("Indica el primer número");
			 
		int num1, num2;
		
		num1 = sc.nextInt();
		
		System.out.println("Indica el segundo número");
		
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El "+num1+" es mayor que el "+num2);
			
		}else {
			System.out.println("El "+num2+" es mayor que el "+num1);
		}
		
		sc.close();
		

	}

}
