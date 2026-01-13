package Bidimisionales;

public class Ejercicio2 {
/*Obtener y mostrar la longitud de la fila más larga de un array  bidimensional. 
Probarlo con el siguiente array:   

{{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arra1={{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}};
		int maxLargo=0;
		for(int i=0; i<arra1.length;i++) {
		int[] A=arra1[i];
		if(A.length>maxLargo) {
			maxLargo=A.length;
			maxLargo=i;
			}
			//maxLargo=Math.max(maxLarga, A.length);
		}
		System.out.println("La fila más larga es"+(maxLargo+1)+" y te");
	}

}
