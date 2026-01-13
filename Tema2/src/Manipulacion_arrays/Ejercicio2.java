/**
 * 
 */
package Manipulacion_arrays;

/**
 * 
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18] en otros
		 * tres:
		 * 
		 * El primero tiene que contener todos los elementos menores de 10, el segundo
		 * los elementos entre 11 y 20 y el tercero los elementos entre 21 y 30. Los
		 * elementos mayores de 30 serán descartados y los arrays no pueden tener
		 * posiciones vacías.
		 */

		int[] nums= {2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18};
		int cont10=0,cont20=0,cont30=0;
		for(int i=0; i<nums.length;i++) {
		
			if(nums[i]<=10) {
			cont10++;}
			else if(nums[i]>=11 && nums[i]<=20) {
				cont20++;
			}
			else if(nums[i]>=21 && nums[i]<=30) {
				cont30++;
			}
		}
		int[] nums10=new int[cont10];
		int[] nums20=new int[cont20];
		int[] nums30=new int[cont30];
		
		int mover10=0,mover20=0,mover30=0;
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i] <= 10) {
				nums10[mover10]=nums[i];
				mover10++;
			}
			else if (nums[i]>=11 && nums[i]<=20) {
				nums20[mover20]=nums[i];
				mover20++;
			}
			else if (nums[i]>=21 && nums[i]<=30) {
				nums30[mover30]=nums[i];
				mover30++;
			}
		}
		System.out.println(nums10);
		System.out.println(nums20);
		System.out.println(nums30);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
