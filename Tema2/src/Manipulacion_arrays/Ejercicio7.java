/**
 * 
 */
package Manipulacion_arrays;

import java.util.Arrays;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Coger la siguiente frase “Esta es la frase del ejercicio siete” y obtener dos
		 * arrays de caracteres, uno donde estén todas las consonantes y otro donde
		 * estén todas las vocales.
		 */
		
		String frase= "Esta es la frase del ejercicio siete";
		frase=frase.replace(" ", "");
		frase=frase.toLowerCase();
		
		int contVocales=0;
		int contConsonates=0;
		
		for(int i=0; i<frase.length();i++) {
		char letras=frase.charAt(i);
		if(letras=='a' || letras=='e' || letras=='i'||letras=='o'||letras=='u') {
			contVocales++;
		}
		else {contVocales++;}
		}
		
		char[]vocales=new char[contVocales];
		char[]consonantes=new char[contConsonates];
		int moverVocales=0;
		int moverConsonantes=0;
		
		for(int i=0; i<frase.length();i++) {
			char letras=frase.charAt(i);
			if(letras=='a' || letras=='e' || letras=='i'||letras=='o'||letras=='u') {
				vocales[moverVocales]=letras;
				moverVocales++;
			}
			else {consonantes[moverConsonantes]=letras;
			moverConsonantes++;}
			}
		System.out.println(Arrays.toString(vocales));
		System.out.println(Arrays.toString(consonantes));
		
	}

}
