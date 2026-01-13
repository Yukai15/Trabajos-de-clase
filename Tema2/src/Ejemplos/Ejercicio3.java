/**
 * 
 */
package Ejemplos;

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

		System.out.println("introduce tu nombre");
		String nombre = leer.nextLine();
		
		System.out.println("introduce tu edad");
		String edad = leer.nextLine();
		
		System.out.println("hola \""+ nombre+"\""+"felicices \""+edad+ "\""+ " años");

	}

}
