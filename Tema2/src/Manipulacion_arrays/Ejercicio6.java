/**
 * 
 */
package Manipulacion_arrays;

import java.util.Arrays;

/**
 * 
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio. Array de String a partir de char A partir del siguiente array de
		 * caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’, ‘i’, ‘o’, ‘p’, ‘x’], obtener un array de
		 * Strings donde los caracteres del array anterior estén agrupados de 3 en 3. Es
		 * decir, obtener el array [“abf”, “gei”, “opx”]
		 */
		
		char[]letras= {'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x'};
		String[] cadenas= new String[letras.length/3];
		
		int indice=0;
		for(int i=0; i<cadenas.length;i++) {
			cadenas[i]="";
		}
		for(int i=0; i<letras.length;i++) {
			if(i%3==0 && i!=0) {indice++;}
			cadenas[indice]=cadenas[indice]+letras[i];
		}
		System.out.println(Arrays.toString(cadenas));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
