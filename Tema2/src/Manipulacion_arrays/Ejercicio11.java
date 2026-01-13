/**
 * 
 */
package Manipulacion_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
		 * sus mesas.
		 * 
		 * En una mesa se pueden sentar de 0 (mesa vacía) a X comensales (mesa llena).
		 * 
		 * El nº de comensales y de mesas se definirán como constantes asignándoles un
		 * valor.
		 * 
		 * Cuando llega un grupo de clientes al restaurante se les pregunta cuántas
		 * personas son. De momento el programa no está preparado para colocar a grupos
		 * mayores a X comensales, por tanto, si un cliente dice por ejemplo que son un
		 * grupo de 6, y el nº de comensales es 4 el programa dará el mensaje “Haga
		 * grupos de 4 personas como maximo e intente de nuevo”.
		 * 
		 * Para el grupo que llega, se busca y asigna siempre la primera mesa libre (con
		 * 0 personas). Si no quedan mesas libres, se busca y asigna donde haya un hueco
		 * para todo el grupo, por ejemplo si el grupo es de dos personas y el número de
		 * comensales X es 4, se colocará donde haya una o dos personas.
		 * 
		 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y X. Al
		 * arrancar el programa y cada vez que se sienten nuevos clientes se debe
		 * mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya
		 * huecos sueltos suficientes.
		 * 
		 * El programa se repetirá de manera indefinida hasta que se introduzca un valor
		 * negativo (Suponemos que siempre se introducen valores enteros, no hay que
		 * comprobarlo)
		 */
		
		Scanner leer=new Scanner(System.in);
		int[]mesas = new int [10];
		int num=0;
		int cont=0;
		for(int i=0;i<mesas.length;i++) {
			mesas[i]=(int)(Math.random()*5+0);	
			}
		
		do {
			
			System.out.println("Ocupacion actual de las mesas: "Arrays.toString(mesas) );
			System.out.println("Introduzca el numero de comensales (entre 1 y 5 o un numero negativo para salir del programa )");
			num=leer.nextInt();
			if(num>5) {System.out.println("Haga grupo de cinco personas como maximo e intente de nuevo");}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		}while(num>0);
		System.out.println("Hasta luego");
				
				
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
