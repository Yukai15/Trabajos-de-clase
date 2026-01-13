/**
 * 
 */
package Estructuras_condicionales;

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
		
		System.out.println("Introduce la base");
		int b=leer.nextInt();
		System.out.println("Introduce el exponente");
		int e=leer.nextInt();
		 
		if (e==0) {System.out.println("el resultado es 1");}
		else if(e<0) {System.out.println("");}
		
		
		}

	}

}
