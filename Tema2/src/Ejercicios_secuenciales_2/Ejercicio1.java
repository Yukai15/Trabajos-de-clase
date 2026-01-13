/**
 * 
 */
package Ejercicios_secuenciales_2;

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

		System.out.println("Escribe un numero");
		double num1 = leer.nextInt();

		System.out.println("escribe otro numero");
		double num2 = leer.nextInt();
		
		double suma = num1+num2;
		double resta=num1-num2;
		double m=num1*num2;
		double d=num1/num2;
		
		System.out.println("la suma es: "+ suma + " ,la resta es: "+ resta + " ,la multiplicacion es: " + m+ " ,la division: "+ d);
		
		leer.close();
	}

}
