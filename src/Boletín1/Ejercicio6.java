package Boletín1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 6:
		Realiza un programa que informe al usuario (mostrando true) si un número 
		es múltiplo de otro número. Ambos números se piden por teclado.*/
 
		Scanner sc = new Scanner (System.in); //Preparamos la herramienta para leer la entrada del usuario
			
			System.out.println("Introduce el primer número");
		
		int num1 = sc.nextInt();
		
			System.out.println("Introduce el segundo número");
		
		int num2 = sc.nextInt();
		
		boolean resultado = (num1 % num2 == 0) && (num2 % num1 == 0);
			System.out.println(resultado);
		
		sc.close();
		
		
	}

}
