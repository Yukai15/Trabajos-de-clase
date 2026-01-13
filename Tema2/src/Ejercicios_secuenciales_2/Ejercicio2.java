/**
 * 
 */
package Ejercicios_secuenciales_2;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el nº de horas trabajadas");
		double num1 = leer.nextInt();
		
		System.out.println("introduce el valor por horas");
		double num2 = leer.nextInt();
		
		double s=num1*num2;
		System.out.println("tu salario es"+ s );

	}

}
