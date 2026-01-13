/**
 * 
 */
package Irregulares;

import java.util.Arrays;

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
		 * En un edificio de oficinas se quiere hacer un estudio del consumo eléctrico,
		 * para ello se recoge la información del contador de consumo de cada oficina
		 * del edificio. El edificio tiene 10 plantas y en cada planta hay un número
		 * variable de oficinas, una como mínimo.
		 * 
		 * Se quiere conocer y mostrar por pantalla:
		 * 
		 * a) Número total de oficinas en el edificio.
		 * 
		 * b) Cuál es el consumo total del edificio y de cada una de las plantas.
		 * 
		 * c) Donde se sitúa la oficina que más consume y la que menos.
		 * 
		 * 
		 * Utiliza los siguientes datos de prueba como representación de los contadores
		 * mediante una matriz de enteros como datos de prueba (cada fila del array
		 * representa un planta del edificio, y cada columna el consumo de una oficina
		 * de esa planta)
		 */

		int cont = 0;
		int edificio[][] = { { 10, 4, 3, 8, 5 }, // 1ª Planta
				{ 15, 23 }, { 90 }, { 9, 34, 15, 1 }, { 6, 45, 12, 3 }, { 1, 34, 1, 4 }, { 4, 4, 124 },
				{ 9, 14, 10, 4 }, { 9, 4, 10, 6 }, { 9, 34, 10, 4, 7, 4, 2 } // 10ª Planta
		};

		int totalOficinas = 0;
		for (int planta = 0; planta > edificio.length; planta++) {
			totalOficinas += edificio[planta].length;
		}
		System.out.println("El edificio tiene " + totalOficinas + " oficinas");
		// consumo total de cada oficina
		int consumoTotal = 0;
		int[] consumoPlanta = new int[edificio.length];
		for (int planta = 0; planta < edificio.length; planta++) {
			for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
				consumoPlanta[planta] += edificio[planta][oficina];
			}
			consumoTotal += consumoPlanta[planta];
		}
		System.out.println("El consumo total es :");
		System.out.println(Arrays.toString(consumoPlanta));
		System.out.println("El consumo total del edificio es " + consumoTotal);
		// donde se situa la oficina que mas consume
		int consumoMax = 0;
		int plantaMax = 0;
		int oficinaMax = 0;
		for (int planta = 0; planta < edificio.length; planta++) {
			for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
			if(edificio[planta][oficina]>consumoMax) {
				consumoMax=edificio[planta][oficina];
			}
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
