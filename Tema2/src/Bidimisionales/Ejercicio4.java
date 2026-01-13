package Bidimisionales;

public class Ejercicio4 {
/*Dado el array unidimensional de enteros (por ejemplo {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3}) 
 * transformarlo  en un array bidimensional donde cada cuatro elementos del  primer array unidimensional forman una fila del segundo. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arra1={4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3};
		int[][] arays= new int [6][4];
		int indice=0;
		for(int i=0;i<arays.length;i++) {
			for (int j=0; j<4; j++) {			
				arays[i][j]=arra1[indice]; 
				System.out.print(arays[i][j]);	
				indice++;
			}
			System.out.println();
		}
	}

}
