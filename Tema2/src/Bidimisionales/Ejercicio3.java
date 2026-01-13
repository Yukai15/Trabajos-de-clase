package Bidimisionales;

public class Ejercicio3 {
/*En una matriz de enteros obtener cual es el elemento  mayor.

Probarlo con:  
{{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}} 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solución Profe
		int [][]arra1={{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}};
		int elemMayor=arra1[0][0];
		for(int i=0; i<arra1.length;i++) {
			for(int j=0;j<arra1[i].length;j++) {
				elemMayor=Math.max(elemMayor, arra1[i][j]);
			}
		}
		System.out.println("Máximo es: "+ elemMayor);
	
	}

}
		//Solución Isma
/*		int [][]arra1={{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}};
		int max=0;
		for(int i=0; i<arra1.length;i++) {
			for(int j=0;j<arra1[i].length;j++) {
			if(arra1[i][j]<max){
				arra1[i][j]=max
				}
			}
		}
		System.out.println("Máximo es: "+ max);
	
	}

}
*/
