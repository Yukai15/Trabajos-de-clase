package Bidimisionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arrayA= {{3,6,8,5},{4,7,1,9}};
		int[][]arrayB= {{2,5,6,3},{7,-7,3,4}};
		
		int[][] suma= new int[arrayA.length][arrayA[0].length];
		//int [][]suma = new int [numFilas][numCols];
		
		for(int i=0; i<arrayA.length;i++) {
			int[]arrayA=A[i];
			int[]arrayB=B[i];
			for(int j=0; j<arrayA.length;i++) {
				if((i+j)%2==0) {
					suma[i][j]=arrayA[j]+arrayB[j];
				}
				System.out.println(suma[i][j]+" ");
			}
		}
		
	}

}
