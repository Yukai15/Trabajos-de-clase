/**
 * 
 */
package Estructuras_condicionales;

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
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int n=leer.nextInt();
	    int d=n/2;
	    
	    if (d) {System.out.println("El numero es par");}
	    
	    else if(d%2>0) {System.out.println("El numero es impar");}
	    		
		
	}

}
