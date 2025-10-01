package Boletín1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 1: Preguntar dos notas al alumno y calcular la media. Mostrar la media y a qué corresponde su
		calificación (insuficiente, suficiente, bien, notable, sobresaliente).*/
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce tu primera nota");
		
		double nota1=sc.nextDouble();
		
		System.out.println("Introduce tu segunda nota");
	
		double nota2=sc.nextDouble();
		
		double  media= (nota1 + nota2) /2;
		
		System.out.println("Tu nota media es: " + media);
		
		
		if (media==10) { 
			System.out.println("Genial, has obtenido un Sobresaliente en tu nota, sigue así!!!");
		} else if (media > 6 && media <10) {
			System.out.println("Buen trabajo, tu nota es un Notable, sigue mejorando!!");
		
		} else if (media >5 && media <7) {
			System.out.println("Algo justo chaval, pero lo conseguiste tu nota es un Suficiente!");
			
		} else if (media >=5) {
			System.out.println("Por los pelos amigo, de la que te has librado, creo que lo puedes hacer muuuuucho mejor!");
			
		} else if (media <5 && media >=4) {
			System.out.println("Has suspendido pero algo te has esforzado, sigue así y aprobarás!");
		
		} else if (media <4 && media >=1) {
			System.out.println("No te lo has currado mucho, con que te vas para la recuperación, esfuérzate más so pringao!");
	
		} else {
			System.out.println("Menudo mierdón de media que tienes! No has puesto bien ni tu nombre.");
		}
		
	    sc.close();

	}

}