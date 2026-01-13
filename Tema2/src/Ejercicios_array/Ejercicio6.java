/**
 * 
 */
package Ejercicios_array;

import java.util.Scanner;

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
		 * Crea un array de 10 elementos de tipo entero, introduce 10 valores por
		 * teclado y almacénalos en los elementos del array. Después calcula y muestra
		 * por pantalla el valor máximo y mínimo
		 */
		
		Scanner leer=new Scanner(System.in);
		
		int nummax;
		int nummin;
		int[]nums=new int[10];
		for(int i=0;i<10;i++) {System.out.println("Introduce un numero");
		int num=leer.nextInt();
		nums[i]=num;}
		nummax=nums[0];nummin=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nummax<nums[i]) {nummax=nums[i];}
			if(nummin>nums[i]) {nummin=nums[i];}
		}
		System.out.println("El maximo es: "+ nummax);
		System.out.println("El minimo es: "+nummin);
		leer.close();
			
		
		

	}

}
