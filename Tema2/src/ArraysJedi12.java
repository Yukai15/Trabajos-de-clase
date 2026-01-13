import java.util.Scanner;

public class ArraysJedi12 {
/*Escribe un programa en Java que lea 15 números por teclado y que los almacene en un array.

Desplaza los elementos de ese array una posición, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.

Finalmente, muestra el contenido del array.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int tam=15;
		int[] nums=new int[tam];
		int[]numsDesp=new int[tam];
		int indice=1;
		System.out.println("Introduce números enteros y pulsando INTRO: ");
		for(int i=0; i<nums.length; i++ ) {
			nums[i]=leer.nextInt();
		}
		System.out.println("-----Array Original-----");
		for(int o:nums) {
			System.out.println(o +" | ");
		}
		numsDesp[0]=nums[tam-1];
		for(int i=1;i<nums.length;i++) {
			numsDesp[indice]=nums[i-1];
			indice++;
		}

		System.out.println("-----Array Desplazado-----");
		for(int b:numsDesp) {
			System.out.println(b+" | ");
		}
		
		leer.close();
	}

}
