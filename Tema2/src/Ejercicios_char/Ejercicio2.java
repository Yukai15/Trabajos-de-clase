/**
 * 
 */
package Ejercicios_char;

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
		/*
		 * Capturar por pantalla una frase cualquiera.
		 * El programa debe calcular y mostrar por pantalla cuántas letras, dígitos y
		 * espacios en blanco hay recorriendo la cadena.
		 */
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		int Contador=0, Contadorn=0,Contadore=0;
		String frase=leer.nextLine();
		for(int i=0; i<frase.length();i++) {
			char letra=frase.charAt(i);
			if(Character.isAlphabetic(letra)) {
				
			}
		}
		
	}

}
