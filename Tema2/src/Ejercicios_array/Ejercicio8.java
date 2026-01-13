/**
 * 
 */
package Ejercicios_array;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un vector(array) de tamaño 5, al que llamarás países. En él guardarás
		 * los nombres de 5 países que se introducirán por teclado. En un bucle
		 * posterior al de la inicialización del vector, muestra su contenido.
		 */
		Scanner leer=new Scanner(System.in);
		String[]paises=new String[5];
		for(int i=0;i<paises.length;i++) {
			System.out.println("Introduce un pais");
			String nombrepais=leer.nextLine();
			paises[i]=nombrepais;
		}
		for(int i=0;i<paises.length;i++) {System.out.println(paises[i]);}
		leer.close();

	}

}
