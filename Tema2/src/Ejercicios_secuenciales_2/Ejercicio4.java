/**
 * 
 */
package Ejercicios_secuenciales_2;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("introduce la Temperatura en ºF");
		double f = leer.nextDouble();
		
		double C=(f-32)*5/9;
		
		System.out.println("La temperatura es: "+ C +" ºC");
		

	}

}
