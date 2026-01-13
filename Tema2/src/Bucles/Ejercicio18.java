/**
 * 
 */
package Bucles;

/**
 * 
 */
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mostrar todos los mumeros del 1 al 50
		//Si encuentras multiplo de 3 o 5 dejara de mostrar
		
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {continue;}
		System.out.println(i);}
		System.out.println("===FIN===");
	}
}
