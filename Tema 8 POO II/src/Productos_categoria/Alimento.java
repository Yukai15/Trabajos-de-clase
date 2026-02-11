package Productos_categoria;

public class Alimento extends Productos {
	private int peso;

	public Alimento(String nombre, double precio, int stock, int peso) {
		super(nombre, precio, stock);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void mostrarInfo() {
		super.MostrarInfo();
		System.out.println("Este es el peso de tu alimento: "+peso+ "kg");
		
	}
	
}
