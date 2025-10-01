package Boletín1;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 5:
		
		Escribe una aplicación que pida al usuario dos números enteros y muestre true si ambos
		números son distintos entre sí o alguno de ellos es cero; y false en caso contrario.*/
		 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primero número entero");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número entero");
		
		int num2 = sc.nextInt();	
		
		
		boolean resultado;
		
		resultado = (num1 != num2) || (num1 == 0) || (num2 == 0);
		System.out.println(resultado);
		
		sc.close();
		
		
		
		
	}

}
