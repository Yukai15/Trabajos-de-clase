
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="En esta frase hay varios es ";
		int contador=0;
		for(int i=0; i < frase.length(); i++) {
			char letra=frase.charAt(i);
			if(letra==' ') {
				System.out.println("Tenemos espacio en blanco");
			}
			if(contador==1) {
				System.out.println("Tenemos el primer espacio en blanco");
			}
			else if(contador==3) {
				System.out.println("Tenemos el segundo espacio en blanco");
				break;
			}
		}
	}

}
