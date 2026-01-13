/**
 * 
 */
package Ejercicio_string2;

/**
 * 
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TERREMOTO";
		String resultado = "";
		
		if(str.length()%2!=0) {
			int centro=str.length()/2;
			String izq=str.substring(0,centro).toLowerCase();
			String central=str.substring(centro,centro+1).toUpperCase();
			String dch=str.substring(centro+1).toLowerCase();
			resultado=izq+central+dch;
			System.out.println(resultado);
		}else {
				System.out.println("la palabra debe tener caracteres impares");}
	}

}
