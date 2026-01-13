/**
 * 
 */
package Ejerciciojedi;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		String[] colores= { "rojo", "amarillo", "verde", "azul", "blanco","negro"};
		System.out.println("Cuantas franjas quieres para la bandera");
		int numFranjas=leer.nextInt();
		leer.close();
		for(int i=0; i<numFranjas;i++) {
			int color=(int)(Math.random()*(colores.length));
			System.out.println(colores[color]);
			System.out.println("-------------------");
			}
		
		
		
		
		
		

	}

}
