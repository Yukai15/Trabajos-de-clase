/**
 * 
 */
package Irregulares;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int[][]matriz= new int [5][];
		for(int fila=0;fila<matriz.length;fila++) {
			matriz[fila]=new int[fila+1];
		}
		for(int fila=0;fila<matriz.length;fila++) {
			for(int col=0;col<matriz[fila].length;col++){
				System.out.println("Introduce el elemento "+fila+" x "+ col);
				matriz[fila][col]=leer.nextInt();
			}
		}
		
		System.out.printf("%4d");
		
		
		
		
		
		
		
		
		
		
		
		
		
		leer.close();
	}

}
