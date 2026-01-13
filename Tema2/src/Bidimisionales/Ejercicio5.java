/**
 * 
 */
package Bidimisionales;

import java.util.Arrays;

/**
 * 
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dada la matriz bidimensional
		 * {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}}
		 * 
		 * obtener una matriz con la mitad de filas donde cada nueva fila sea la suma de
		 * dos filas consecutivas. (fila 0 + fila 1, fila 2 + fila 3, etc…)
		 */
		
		int[][]array1= {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}};
		int filas=array1.length/2;
		int cols=array1[0].length;
		int[][] nuevo=new int [filas][cols];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<cols;j++) {
				nuevo[i][j]=array1[i*2][j]+array1[i*2+1][j];}
		}
		System.out.println(Arrays.deepToString(nuevo));
	}

}
