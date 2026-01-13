/**
 * 
 */
package Irregulares;

import java.util.Arrays;

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
		 * Solicita al usuario una frase, después crea un array bidimensional en el que
		 * cada fila sea una palabra de la frase y las columnas serán las letras que
		 * forman esas palabras.
		 * 
		 * Por ejemplo: para la frase “Hola me llamo Lola” tendremos el array: [[H, o,
		 * l, a], [m, e], [l, l, a, m, o], [L, o, l, a]]
		 */
		
	
		String frase="Hola me llamo Lola";
		String [] palabras= frase.split(" ");
		
		char[][] letras=new char[palabras.length][];
		
		for(int i=0;i<letras.length;i++) {String palabra=palabras[i];
			letras[i]=new char[palabras.length)];
			for(int j=0;j<palabras.length;i++) {
				letras[i][j]=palabras.charAt(j);
			}
		}
		
		System.out.println(Arrays.deepToString(letras));
		
		
		
		
		
		
		
		
		
	}

}
