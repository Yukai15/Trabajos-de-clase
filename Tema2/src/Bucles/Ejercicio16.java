/**
 * 
 */
package Bucles;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		System.out.println("Introduce una altura");
		int n=leer.nextInt();
		while(n<=0) {System.out.println("La altura no es valida");
		n=leer.nextInt();
		}
		
		for(int i = n; i>=n; i--) {
			for(int j=1;j>=i;j++) {                            
				System.out.print(j);}
	System.out.println();	}
}
}