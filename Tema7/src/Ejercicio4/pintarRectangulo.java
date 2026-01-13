package Ejercicio4;

import java.util.Scanner;

public class pintarRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Rectangulos rectangulo=new Rectangulos();
	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce la base y la altua del rectangulo");
	int base=sc.nextInt();
	int altura=sc.nextInt();
	rectangulo.base=base;
	rectangulo.altura=altura;
	System.out.println("Rectagunlo con +");
	System.out.println("===================");
	rectangulo.pintar();
	System.out.println("Introduce el caracter con el que quieres pintar: ");
	char signo=sc.next().charAt(0);
	System.out.println("Rectángulo con "+ signo);
	rectangulo.pintarSignos(signo);
	System.out.println("Rectángulo invertido");
	rectangulo.invertido();
	
	System.out.println("El área de este rectangulo vale "+ rectangulo.area());
	System.out.println("El perimetro de este rectangulo vale " + rectangulo.perimetro());
	sc.close();
	}

}
