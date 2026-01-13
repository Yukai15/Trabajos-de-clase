
public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="Esta es la frase que vamos a partir en cuatro";
		
		int tam= frase.length()/2;
		String mitad1=frase.substring(0,tam);
		String mitad2=frase.substring(tam);
		
		tam=mitad1.length()/2;
		String cuarto1=mitad1.substring(0,tam);
		String cuarto2=mitad1.substring(tam);
		
		tam=mitad2.length()/2;
		String cuarto3=mitad2.substring(0,tam);
		String cuarto4=mitad2.substring(tam);
		
		System.out.println(cuarto1);
		System.out.println(cuarto2);
		System.out.println(cuarto3);
		System.out.println(cuarto4);
		}

}
