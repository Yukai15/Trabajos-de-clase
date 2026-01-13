/**
 * 
 */
package Ejerciciojedi;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

/**
 * 
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa para realizar cálculos relacionados con la altura (en
		 * metros) de personas. Pedirá un valor N y luego almacenará en un array N
		 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
		 * mínima así como cuántas personas miden por encima y por debajo de la media.
		 */
		Scanner leer=new Scanner(System.in);
		
		int contador=0;
		int Altura;
		do {System.out.println("Introduce la altura de 5 personas en metros");
		Altura=leer.nextInt();
		contador++;
		}while(contador<5);
		
		int[] array=new int[contador];
		if(Altura<=160 && Altura>=180) {}
		
		
		
		
		
		
	}

}
