package Boletín1;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ejercicio 2:
	 	Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad*/
		  
		
		Scanner sc=new Scanner (System.in);

		
		System.out.println("Introduce tu nombre");
		
		String nomUser=sc.nextLine();
			System.out.println("!Hola "+nomUser+" tu nombre ha sido registrado exitosamente.");
			
			System.out.println("Por favor, introduce tu edad.");
		int edadUser=sc.nextInt();
					
		
		if (edadUser>=18) {
			System.out.println("Hola de nuevo"+nomUser+ "enhorabuena, eres mayor de edad.");
		
		}else {
			System.out.println("Lo sentimos pero aún es menor de edad y por lo tanto, todavía le queda para poder autogestionar su vida.");
		}
		
		sc.close();
		
		
	}

}