/**
 * 
 */
package Bucles;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma = 0;
		Scanner leer = new Scanner(System.in);
		while (true) {
			System.out.println("Introduce un numero");
			num=leer.nextInt();
			if(num>0) {suma+=num;}
			else {break;}
			System.out.println("La suma es"+  suma);
		}
	}

}
