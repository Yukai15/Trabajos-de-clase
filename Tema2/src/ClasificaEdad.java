import java.util.Scanner;

public class ClasificaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=leer.nextInt();
		System.out.println("Vives solo? [1 sí] o [0 no] ");
		int solo=leer.nextInt();
		boolean viveSolo=(solo==1);
		System.out.println("Va al colegio? [1 sí] o [0 no]");
		int cole=leer.nextInt();
		boolean noCole=(cole==1);
		
		if(edad<18) {
			if(edad<12) {
				System.out.println("Es un niño");
				if(viveSolo && !noCole) {	
					//if (viveSolo==true && noCole==false)
					System.out.println("Niño de riego");
				}
				}
			
			else {
				System.out.println("Es un adolescente");
			}
		}
		else if(edad<25) {
			System.out.println("Es un joven adulto");
		}
		else if(edad<59) {
			System.out.println("Es un adulto");
		}
		else {
			System.out.println("Es un adulto mayor");
		}
	
		leer.close();
	}

}
