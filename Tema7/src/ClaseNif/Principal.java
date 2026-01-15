package ClaseNif;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Nif miDNI = new Nif(14017386);
		Nif miDNI2 = new Nif(14017386);
		miDNI.calcularletra();
		miDNI.mostrar();
		miDNI2.calcularletra();
		miDNI2.mostrar();
		*/
		Scanner sc=new Scanner(System.in);
		Nif miNumeroNif=new Nif();
		System.out.println("Pon números para el Dni");
		miNumeroNif.numero=sc.nextLong();
		sc.nextLine();
		System.out.println("Pon la letra del Dni");
		char Nifletras=sc.nextLine().charAt(0);
		miNumeroNif.calcularletra();
		if(miNumeroNif.letra==Nifletras){
			System.out.println("El número es correcto");
		}
		else {
			System.out.println("El número es incorrecto");
			System.out.println("La letra corecto sería "+ miNumeroNif.calcularletra());
			System.out.println("El número correcto del DNI es ");
			miNumeroNif.mostrar();
		}
		
		sc.close();
	}

}
