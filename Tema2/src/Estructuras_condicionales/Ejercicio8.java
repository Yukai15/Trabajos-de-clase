/**
 * 
 */
package Estructuras_condicionales;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        
		System.out.println("¿cuantos alumonos participaran en el torneo?");
        int num= leer.nextInt();
        
       int packs =num/20;
       if(packs%20>0) {packs=packs+1;
       }
       int coste=packs*500;
       
       if(num>=100) { int cuota=12;
       System.out.println("la cuota por jugador es "+ cuota + "y el coste ser "+ coste);}
        
        else if(num>=60 && num<=99) {int cuota=15;
        System.out.println("la cuota por jugador es "+ cuota + "y el coste ser "+ coste);}
        
        else if(num>=30 && num<=59) {int cuota=20;
        System.out.println("la cuota por jugador es "+ cuota + "y el coste ser "+ coste);}
        
        else if(num<30) {int cuota=25;
        System.out.println("la cuota por jugador es "+ cuota + "y el coste ser "+ coste);}

	}

}
