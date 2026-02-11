package Productos_categoria;

public class Productos {
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Productos(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public void MostrarInfo() {
		System.out.println("Nombre dek producto "+nombre+ " con el precio de " +precio+ " con este de stock " +stock);
	}
	
}
