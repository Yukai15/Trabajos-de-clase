/**
 * 
 */
package Estructuras_condicionales;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un nº entero");
		int num=leer.nextInt();
		
		//solucion uno 
		
		//num=Math.abs(num);
		//String nums = Sring.valueOf(num);
		//int cont = nums.length();
		
		//solucion dos
		if(num<10 && num>-10) {System.out.println("tiene 1 cifra");}
		else if(num<100 && num>-100){System.out.println("tiene 2 cifras");}
		else if(num<1000 && num>-1000) {System.out.println("tiene 3 cifras");}
		else {System.out.println("tiene 4 cifras o mas");}
		leer.close();
	}

}
