/**
 * 
 */
package Ejercicios_clase_math;

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
		/*
		 * Capturamos un número entero por teclado. Si el usuario teclea un número
		 * negativo lo convertimos en positivo y se lo mostramos al usuario. Deseamos
		 * saber cuántos números han sido introducidos y cuántos de ellos han tenido que
		 * ser convertidos a positivos. Criterio para finalizar: Mensaje ¿Quieres
		 * continuar?(S/N)
		 */
	     Scanner leer=new Scanner(System.in);
	     int contadortotal=0,contadorconvertidos=0;
	     char respuesta;
	     do {
		System.out.println("Introduce un numero: ");
		int num=leer.nextInt();
		contadortotal++;
		if(num<0) {contadorconvertidos++;}
		System.out.println(Math.abs(num));
		System.out.println("Quieres continuar (S/N)?");
		respuesta = (char) System.in.read();
	     }while (respuesta=='S');
	     System.out.println("Se han introducido "+ contadortotal + " numeros de los cuales " + contadorconvertidos + " se han convertido");
	}

}
