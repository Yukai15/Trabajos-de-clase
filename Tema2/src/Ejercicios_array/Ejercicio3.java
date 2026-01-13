/**
 * 
 */
package Ejercicios_array;

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
		 * Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10,
		 * 11} indicando para cada uno de ellos si es par o impar.
		 */
		
		int[] nums= {2, 3, 4, 7, 8, 10,11};
		/*for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {System.out.println("es par");}
			else {System.out.println("es impar");}
			}*/
		for(int n:nums) {
			if (n%2==0) {System.out.println(n+" es par");}
			else {System.out.println(n+" es impar");}
		}
	}

}
