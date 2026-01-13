/**
 * 
 */
package Bidimisionales;

/**
 * 
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dada una matriz cuadrada obtener cual es la suma de todos los elementos que
		 * componen las dos diagonales.
		 * 
		 * Probarlo con: {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,9,
		 * 20},{21,22,23,24,25}}
		 */
		int[][]matriz={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,9,20},{21,22,23,24,25}};
		int sumaD1=0;
		int sumaD2=0;
		
		for(int i=0;i<matriz.length;i++) {
			sumaD1+=matriz[i][i];
			sumaD2+=matriz[i][matriz.length-1-i];
		}
		System.out.print("suma diagonal principal: "+sumaD1);
		System.out.println();
		System.out.print("suma diagonal secundaria: "+sumaD2);
		
		
	}

}
