package Boletín1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ejercicio 4:
Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que nos
influyen en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Sólo podemos
salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que tengamos que ir
a la biblioteca (para realizar algún trabajo entregar los libros, etcétera). Solicitar al usuario
(mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
algoritmo debe mostrar mediante un booleano (TRUE o FALSE) si es posible que se le otorgue el
permiso para ir a la calle.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Hola terrícola ¿Está lloviendo actualmente? (true/false)");
		
		boolean estaLloviendo = sc.nextBoolean();
		
		System.out.println("¿Has terminado tus deberes comadreja? (true/false)");
		
		boolean tareasTerminadas = sc.nextBoolean();
		
		System.out.println("¿Necesitas ir a la biblioteca a jugar al Candy Crush? (true/false)");
		
		boolean irBiblioteca = sc.nextBoolean();
		
		boolean puedeSalir = (!estaLloviendo && tareasTerminadas && irBiblioteca);
		
		 System.out.println("¿Puedes salir a la calle?: " + puedeSalir);
		
		sc.close();




	}

}