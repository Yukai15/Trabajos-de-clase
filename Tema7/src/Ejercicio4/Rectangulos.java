package Ejercicio4;

public class Rectangulos {
	int base;
	int altura;
	
	void pintar() {
		for(int i=0;i<altura;i++) {
			for(int j=0;j<base;j++) {
				System.out.println("+");
			}
			System.out.println();
		}
	}
	void pintarSignos(char signos) {
		for(int i=0;i<altura;i++) {
			for(int j=0;j<base;j++) {
				System.out.println(signos);
			}
			System.out.println();
		}
	}
	void invertido() {
		for(int i=0;i<base;i++) {
			for(int j=0;j<altura;j++) {
				System.out.println("+");
			}
			System.out.println();
		}
	}
	int area() {
		return base*altura;
	}
	int perimetro() {
		return 2*base+2*altura;
	}
}
