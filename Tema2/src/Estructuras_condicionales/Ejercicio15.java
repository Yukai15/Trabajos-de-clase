/**
 * 
 */
package Estructuras_condicionales;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Que tipo de cliente eres:");
		System.out.println("1. Cliente Vip");
		System.out.println("2. Cliente regular");
		int c = leer.nextInt();
		
		System.out.println("Importe de la compra:");
        boolean i = leer.nextBoolean();
        
        System.out.println("¿Es fin de semana?");
        System.out.println("1. si");
        System.out.println("2. no");
         int dia=leer.nextInt();
         
        switch(c) {
        
        }
	}

}
