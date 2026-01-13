/**
 * 
 */
package Manipulacion_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class SolucionEjercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner(System.in);
		
		final int maxComensales = 6;
		final int numMesas=10;
		int mesas= new int [numMesas];
		int num=0;
		for(int i=0;i<numMesas;i++) {
			mesas[i]=(int)(Math.random()*(maxComensales+1));
		}
do {
			
			System.out.println("Ocupacion actual de las mesas: " );
			System.out.println(Arrays.toString(mesas));
			System.out.println("Introduzca el numero de comensales (entre 1 y 5 o un numero negativo para salir del programa )");
			num=leer.nextInt();
			if(num>5) {System.out.println("Haga grupo de cinco personas como maximo e intente de nuevo");}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		}while(num>0);
		System.out.println("Hasta luego");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
