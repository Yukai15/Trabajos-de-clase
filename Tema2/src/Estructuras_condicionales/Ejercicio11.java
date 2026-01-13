/**
 * 
 */
package Estructuras_condicionales;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Sombrero seleccionador---");
		System.out.println("1.Valentia");
		System.out.println("2.Lealtad");
		System.out.println("3.Inteligencia");
		System.out.println("4.Ambicion");
		
		Scanner leer = new Scanner(System.in);
		int num1 = leer.nextInt();
		
		switch(num1) {
			case 1:
				System.out.println("Gryffindor");
				break;
			case 2:
				System.out.println("Hufflepuff");
				break;
			case 3:
				System.out.println("Ravenclaw");
				break;
			case 4:
				System.out.println("Slytherin");
				break;
				}
		
		
	}

}
