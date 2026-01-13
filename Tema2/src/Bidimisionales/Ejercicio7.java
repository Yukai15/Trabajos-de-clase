/**
 * 
 */
package Bidimisionales;

import java.util.Arrays;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hacer un programa Java, que:
		 * 
		 * Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'. Carga la matriz
		 * de manera que las filas pares se rellenan con 1 y las filas impares con 0.
		 * Una vez inicializada la matriz muestra su contenido en pantalla
		 */
		
		int[][]tabla=new int [10][10];
		for (int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i%2==0)
					{Arrays.fill(tabla[i],1);}
				else
				{Arrays.fill(tabla[i],0);}
			}
		}
		for(int i=0;i<10;i++) {System.out.println(Arrays.toString(tabla[i]));}
		
		
		
		
		
		
		
		
		
	}

}
