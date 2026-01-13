package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Esta es la primera linea de codigo

		/*
		 * aqui escribo varias lineas de texo Vamos a saludar en la primera clase
		 * Ejemplo1 con syso control+espacio atajo
		 */
		System.out.print("holaaaaa");
		System.out.println("¿que tal?");

		int edad;// declarar variable
		edad = 25;// inicializar variable

		// int unidades =29;//declarar e inicializar
		// unidades=29*2;

		final int Max_alumnos = 30; // constante
// Max_alumno=50

		float altura = 1.36f;
		double peso = 3.5;
		char letra = 'a';// caracter
		String palabra = "abc";// cadena de caracteres

		Scanner leer = new Scanner(System.in);

		System.out.print("introduce tu nombre");
		String nombre = leer.nextLine();
		System.out.print("introduce tu edad");
		String Edad = leer.nextLine();

		System.out.println("hola " + nombre +" feliz "+ Edad +" años");
		
		
		
		
		

	}

}
