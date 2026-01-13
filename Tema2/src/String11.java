import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=leer.nextLine();
		
		frase = frase.replace('a', 'A');
		frase = frase.replace('á', 'A');
		frase = frase.replace('e', 'E');
		frase = frase.replace('é', 'E');
		frase = frase.replace('i', 'I');
		frase = frase.replace('í', 'I');
		frase = frase.replace('o', 'O');
		frase = frase.replace('ó', 'O');
		frase = frase.replace('u', 'U');
		frase = frase.replace('ú', 'U');
		leer.close();
	}

}
