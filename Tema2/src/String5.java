
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="Este ejecicio es el  primero que cuenta letras";
		int contador=0;
		for(int i=0; i<frase.length(); i++) {
			if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
				contador++;
			}
		}
		System.out.println("La frase tiene " + contador + " e ");
	}

}
