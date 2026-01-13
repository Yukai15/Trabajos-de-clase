/**
 * 
 */
package Ejerciciojedi;

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
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10 (utiliza Math. Random()). Luego
		 * pedirá un valor N y mostrará en qué posiciones del array aparece N.
		 */
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce un numero del 1 al 10");
		int num=leer.nextInt();
		int posicion=0;
		int[] array=new int[100];
		int tam=array.length;
	
		for(int i=0;i<tam;i++) {
			array[i]=(int)(Math.random()*10+1);	
	
		}

		leer.close();
		
		 
		
		
		
		
		
		
		
		
	}

}
