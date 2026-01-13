/**
 * 
 */
package Ejercicios_clase_math;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

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
		 * Capturamos un número positivo por teclado y deseamos calcular su raíz
		 * cuadrada, si es negativo el programa debe indicarlo y volver a solicitar el
		 * número. Criterio: Mensaje Si desea continuar pulse 1, si no pulse otro número
		 */
		
		Scanner leer=new Scanner(System.in);
		int num;
		int rest;
		do {
		System.out.println("Introduce un numero positivo");
		num = leer.nextInt();
		}while(num<0);
		double resultado=Math.sqrt(num);
		System.out.println(resultado);
		System.out.println("Si quieres continuar introduce 1, otro numero para finalizar");
		rest =leer.nextInt();}
	while(rest==1);
	
	}

}
