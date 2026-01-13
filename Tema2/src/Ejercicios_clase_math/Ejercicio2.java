/**
 * 
 */
package Ejercicios_clase_math;

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
		 * Capturamos un número por teclado y queremos saber el valor de e elevado a ese
		 * número. (e número) Criterio de parada: Introducción del valor 0
		 */
		Scanner leer = new Scanner(System.in);
		int num;
		do{System.out.println("Introducce un numero");
		num = leer.nextInt();

		double resultado = Math.pow(Math.E, num);

		System.out.println(resultado);}
		while(num !=0);
		System.out.println("Adios");
		leer.close();

	}

}
