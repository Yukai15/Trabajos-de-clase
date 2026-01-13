/**
 * 
 */
package Estructuras_condicionales;

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
		Scanner leer = new Scanner(System.in);
		int num=leer.nextInt();
		
		 switch(num) {
		 case 1:
			 System.out.println("En la cara opuesta esta el seis");
			 break;
		 case 2:
			 System.out.println("En la cara opuesta esta el cinco");
			 break;
		 case 3:
			 System.out.println("En la cara opuesta esta el cuatro");
			 break;
		 case 4:
			 System.out.println("En la cara opuesta esta el tres");
			 break;
		 case 5:
			 System.out.println("En la cara opuesta esta el dos");
			 break;
		 case 6:
			 System.out.println("En la cara opuesta esta el uno");
			 break;}
		 default:
			 System.out.println("Error");

	}

}
