/**
 * 
 */
package Ejercicios_array;

/**
 * 
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} obtener otro con ceros
		 * intercalados entre sus posiciones {2, 0, 3, 0, 4, 0, …}
		 */
		int[]nums1={2, 3, 4, 7, 8, 10, 11};
		int[]res= new int[nums1.length*2];
		
		for(int i=0;i<res.length;i++) {
			if(i%2==0) {}res[i]=nums1[i/2];}
		for(int i=0;i<res.length;i++) {System.out.println(res[i]+" ");}
	
	
	
	
	
	}

}
