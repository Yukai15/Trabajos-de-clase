/**
 * 
 */
package Ejercicio_string2;

/**
 * 
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dada una palabra cualquiera introducida por el usuario deducir si es o no un
		 * palíndromo. Un palíndromo es una palabra o frase que se lee igual en un
		 * sentido que en otro (por ejemplo; Ana, somos, arenera, nadan, sagas, sedes…).
		 * Si se trata de números en lugar de letras, se llama capicúa.
		 */
		String palabra="sagas";
		String resultado="" ;
		for(int i = palabra.length() -1 ;i>=0;i--) {
			resultado += palabra.charAt(i);
		}
		if (palabra.equals(resultado)) {System.out.println("la palabra "+ palabra +" es palindroma");}
		else {System.out.println("la palabra no es palindroma");}
	}

}
