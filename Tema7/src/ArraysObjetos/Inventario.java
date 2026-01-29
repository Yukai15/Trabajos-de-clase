package ArraysObjetos;

public class Inventario {
	private String nombre;
	private int stock;
	private double precio;
	
	
	public Inventario(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void aumento(int cantidad) {
		stock +=cantidad;
	}
	
	public void disminuir(int cantidad) {
		stock -=cantidad;
	}
	public void promocion() {
		if(stock<4) {
			
		}
	}
	@Override
	public String toString() {
		return "Inventario [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
}
