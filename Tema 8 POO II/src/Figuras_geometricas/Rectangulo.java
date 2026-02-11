package Figuras_geometricas;

public class Rectangulo extends Figura {
	protected int base;
	protected int altura;
	
	
	public Rectangulo() {
	this.base=5;
	this.altura=10;
	}
	@Override
	void calculaArea(){
		System.out.println("La base x altura es: "+ base*altura);
	}

	
}
