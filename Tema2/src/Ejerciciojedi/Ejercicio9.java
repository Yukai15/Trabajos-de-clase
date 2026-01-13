/**
 * 
 */
package Ejerciciojedi;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa en Java que pida la temperatura media que ha hecho en
		 * cada mes de un determinado año y que muestre a continuación un diagrama de
		 * barras horizontales con esos datos.
		 * 
		 * Las barras del diagrama se pueden dibujar a base de 'o'
		 */
		Scanner leer=new Scanner(System.in);
		int contador=1;
		int mes;
		int [] array=new int[12];
		do {
		System.out.println("Introduce la temperaura del mes "+ contador);
		mes=leer.nextInt();
		contador++;}
		while(contador<=12);
		
		
		
		
	}

}
