package Boletín2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pide al usuario su edad e indica si
		puede votar (mayor o igual a 18 años).*/
		 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu edad actual");
		
		int edad = sc.nextInt();
		
		boolean puedeVotar;
		
		puedeVotar = (edad >= 18);
		
		if (puedeVotar){
		
			System.out.println(" ¡¡¡Enhorabuena!!! Puedes votar como todos los mayores de edad en este país de pandereta ");
			
		}else {
				
			System.out.println("¡¡¡¡Noooooooooooope!!! No puedes votar hasta que no tengas algún que otro año más");
			
		}	
		
	}
}
