/**
 * 
 */
package Estructuras_condicionales;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("---COLORES PRIMARIOS---");
		System.out.println("1. Rojo");
		System.out.println("2. Azul");
		System.out.println("3. Amarillo");
		System.out.println("elige un color(1-3)");
		
		int c=leer.nextInt();
		int cd=leer.nextInt();
		
		switch(c) {
		case 1:
			switch(cd) {
			case 1:System.out.println("has elegido dos colores iguales");
				break;
			case 2:System.out.println("Morado");
				break;
			case 3:System.out.println("Naranja");
				break;}
			
			break;
		case 2:
			switch(cd) {
			
			case 1:System.out.println("Naranja");
				break;
			
			case 2:System.out.println("has elegido dos colores iguales");
				break;
			
			case 3:System.out.println("Verde");
				break;
			
			default:System.out.println("color no valido");
			break;
			}
		case 3:
			switch(cd) {
			case 1:System.out.println("naraja");
				break;
			case 2:System.out.println("verde");
				break;
			case 3:System.out.println("has elegido dos colores iguales");
				break;}
			
			break;
			
			}
		}

}
