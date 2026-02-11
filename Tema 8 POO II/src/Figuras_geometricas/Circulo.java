package Figuras_geometricas;

public class Circulo extends Figura {
	private int radio;

	@Override
	void calculaArea() {
		double area=Math.PI*Math.pow(this.radio,2);
		System.out.println("El área sería "+area);
	}
	@Override
	void mostrarNombre() {
		System.out.println("Círculo");
	}
}
