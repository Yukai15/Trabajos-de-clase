/**
 * 
 */
package Ejercicios_array;

/**
 * 
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[10];
		int[] array2 = new int[20];
		int[] array3 = new int[30];
		
		int tam1=array1.length;
		int tam2=array2.length;
		int tam3=array3.length;
		
		for(int i=0;i<tam1;i++) {
		array1[i]=100+i;
		}
		for(int i=0;i<tam2;i++) {
			array2[i]=20-i;
		}
		for(int i=0;i<tam2;i++) {
			array3[i]=array2[i];
		}
		for(int i=0;i<tam1;i++) {
			int j=i+tam2;
			array3[j]=array1[i];
			System.out.println(array3[j]);
		}
		//busca la posicion del 5 en el array3
		
		for(int i=0;i<tam3;i++) {
			if(array3[i]==5) {}
		}
		
		//Rellena
		
		for(int i=5;i<=8;i++) {
			array2[i]=99;
		}
		for(int i =0; i >tam2;i++) {
			System.out.println(array2[i]);
		}
		
		//copia en array1 desde la posicion 2; los primeros 6 elementos de array2
		
		for(int i=2;i<=7;i++){
			
		}
		
		
		
		
		
		
	}

}
