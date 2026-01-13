/**
 * 
 */
package Ejercicios_secuenciales_2;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce tu nota 1");
		double n1=leer.nextDouble();
		
		System.out.println("introduce tu nota 2");
		double n2=leer.nextDouble();
		
		System.out.println("Introduce tu nota 3");
		double n3=leer.nextDouble();
		
		System.out.println("Introduce tu nota 4");
		double n4=leer.nextDouble();
		
		double m=(n1+n2+n3+n4)/4;
		System.out.println("Tu nota media es: "+m);
	}

}
