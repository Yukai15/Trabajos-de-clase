/**
 * 
 */
package Ejerciciojedi;

import java.lang.reflect.Array;
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
		/*
		 * array de 100 numeros reales aleatorios entre 0.0 y 1.0 utiliza math.random y
		 * luego pide al usuario un valor real R. muestra los valores del array que sean
		 * igual o superiores a R
		 */
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero real");
		double R = leer.nextDouble();
		leer.close();


		double[] array = new double[100];
		int tam=array.length;
		for (int i = 0; i <tam; i++) {
			array[i] = Math.random(); 
			//if (R<array[i]) {
			//System.out.println();}
		}
		for(int i=0;i<tam;i++) {
			if (array[i]>=R) {System.out.println(array[i]);}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
