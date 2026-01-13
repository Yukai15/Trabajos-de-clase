import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=leer.nextInt();
		int contador=0;
		int valor=0;
		do {
			valor++;
			if(valor%2!=0) {
				contador++;
				System.out.println(valor);
			}
			else {
				continue;
			}
		}
		while(contador<num);
		leer.close();
	}

}
