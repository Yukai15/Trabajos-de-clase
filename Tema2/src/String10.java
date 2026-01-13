
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="LoCoMoToRa";
		String mitad1=palabra.substring(0,palabra.length()/2);
		String mitad2=palabra.substring(palabra.length()/2);
		
		String mayuscula=mitad1.toUpperCase();
		String minuscula=mitad2.toLowerCase();
		
		System.out.println("la palabra queda como "+ mayuscula + minuscula);
	}

}
