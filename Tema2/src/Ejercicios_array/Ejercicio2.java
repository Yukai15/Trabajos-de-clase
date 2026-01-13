/**
 * 
 */
package Ejercicios_array;

/**
 * 
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtener la suma de los elementos del siguiente array: {1, 4, 6, 10, -3, 4, 6,-5}
		int suma=0;
		int[] array1= {1, 4, 6, 10, -3, 4, 6,-5};
		/*for(int i=0; i<array1.length;i++) {
			suma=suma+array1[i];
			System.out.println("la suma es: "+suma);*/
		for(int n:array1) {suma=suma+n;}
		System.out.println("la suma es: "+suma);
		
		 
	}

}
