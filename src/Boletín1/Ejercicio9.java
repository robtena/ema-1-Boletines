package Boletín1;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Ejercicio 9:
	 Pedir tres números y mostrarlos ordenados de mayor a menor*/
		
	Scanner sc = new Scanner (System.in);
	
	int num1, num2, num3;
	 
		System.out.println("Dime el primer número.");
	
	num1 = sc.nextInt();
	
		System.out.println("Dime el segundo número.");
		
	num2 = sc.nextInt();
	
		System.out.println("Dime el tercer número.");
		
	num3 = sc.nextInt();
	
	if(num1<num2&&num1<num3) { /*ME FIJÉ DEL QUE HICIMOS, NO HABRÍA SACADO ESTE ALGORITMO
								 SOLO NI DE FLY*/
		if(num2<num3) {
			System.out.println("El orden es: " +num1+"  "+num2+"  "+num3);
		}else {
			System.out.println("El orden es: " +num1+"  "+num3+"  "+num2);
		}
	}else if(num2<num1&&num2<num3) {
		if(num1<num3) {
			System.out.println("El orden es: "+num2+"  "+num1+" "+num3);
		}else {
			System.out.println("El orden es; "+num2+"  "+num3+"  "+num1);
			}
		}else if(num3<num1&&num3<num2) {
			if(num1<num2) {
				System.out.println("El orden es: "+num3+"  "+num1+"  "+num2);
			}
		}else {
			System.out.println("El orden es: "+num3+"  "+num2+"  "+num1);
		}
		sc.close();
	}


	
}