/**
 * 
 */
package Ejerciciojedi;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		int totalElementos = 0;
		for (int i = 1; i <= 10; i++) {
			totalElementos += i;
		}
		
		int[] secuencia= new int[totalElementos];
		
		int indice=0;
		for(int i=1; i<=10; i++) {
			for(int j=0;j<i;j++) {
			secuencia[indice]=i;
			indice++;}
		}
				
				System.out.println("secunecia generada");
			for(int i=0; i< secuencia.length;i++) {
				System.out.println(secuencia[i]);
				if(i< secuencia.length-1) {
					System.out.println(", ");
				}
			}
		
		
		
		
		
		
		
		
		
		

	}

}
