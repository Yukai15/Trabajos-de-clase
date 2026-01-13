
public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase= "Esta es la frase donde vamos a  poner almohadillas";
		String frase2="";
		for(int i=0; i<frase.length();i++) {
			if(i % 3 !=0 || i==0) {
				frase2 =frase2 + frase.charAt(i);
			}
			else {
				frase2=frase2 +'#';
			}
		}
		System.out.println(frase2);
	}

}
