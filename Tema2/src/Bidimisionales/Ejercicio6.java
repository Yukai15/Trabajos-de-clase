/**
 * 
 */
package Bidimisionales;

/**
 * 
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]num=new int [3][6];
		num[0][0]=0;
		num[0][1]=1;
		num[0][2]=2;
		num[0][5]=7;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		System.out.printf("%6s"," ");
		for (int columna=0;columna<6;columna++) {
			System.out.printf("%10s"," columna "+columna);
			}
		for(int fila=0;fila<num.length;fila++) {
			System.out.print("n\fila "+fila);
			for (int columna=0;columna<num[fila].length;columna++) {
				System.out.printf("%10s",num[fila][columna]);
			}
		}
	}

}
