/**
 * 
 */
package Ejercicios_array;

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
		 * Dados estos dos arrays: {1, 3, 5, 7, 8} y {1, 2, 3, 4, 5} obtener y mostrar
		 * un array llamado resultado que sea la suma de ambos (suma de elementos de la
		 * misma posición).
		 */
		int[] array1= {1,2,5,7,8};
		int[] array2= {1,2,3,4,5};
		int tm = array1.length;
		int[] res=new int[tm];
		for(int i=0;i<tm;i++) {
		res[i]=array1[i] + array2[i];
		System.out.println(res[i]);}
	}

}
