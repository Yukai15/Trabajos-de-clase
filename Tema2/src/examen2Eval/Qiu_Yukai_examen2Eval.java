package examen2Eval;

import java.util.Arrays;

public class Qiu_Yukai_examen2Eval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matriz=new int[6][6];
		int[]agente=new int[6];
		int puntos=0;
		System.out.println("=====MATRIZ DE CALIFICACIONES=====");
		for(int agentes=0; agentes<matriz.length;agentes++) {
			for(int mision=0; mision<matriz[agentes].length;mision++) {
				matriz[agentes][mision]=(int)(Math.random()*9);
				//int matrices=matriz[agentes][mision];
					if(agentes==mision){
						matriz[agentes][agentes]=-1;
					}
					System.out.println(Arrays.toString(matriz[agentes]));
					if(puntos>=-1 && puntos<=9) {
						if(matriz[agentes][mision]>=7) {
							puntos=+10;
						}
						else if(matriz[agentes][mision]<=6) {
							puntos=5;
						}
						
					}
			}
			
		}
		
		System.out.println("=====PUTUACIÓN TOTAL POR AGENTES=====");
	
		System.out.println("Agente 1: " + puntos);
		System.out.println("Agente 2: " + puntos);
		System.out.println("Agente 3: "	+ puntos);
		System.out.println("Agente 4: "	+ puntos);
		System.out.println("Agente 5: "	+ puntos);
		System.out.println("Agente 6: "	+ puntos);
		
		System.out.println("=====AGENTES APTOS PARA EL SALTO CRÍTICO (>20 puntos)=====");
		
		
		System.out.println("=====ESTADÍSTICAS=====");
	}

}
