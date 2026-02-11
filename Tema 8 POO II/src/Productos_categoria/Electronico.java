package Productos_categoria;

public class Electronico extends Productos {
	private int garantiasMeses;

	public Electronico(String nombre, double precio, int stock, int garantiasMeses) {
		super(nombre, precio, stock);
		this.garantiasMeses = garantiasMeses;
	}

	public int getGarantiasMeses() {
		return garantiasMeses;
	}

	public void setGarantiasMeses(int garantiasMeses) {
		this.garantiasMeses = garantiasMeses;
	}
	
	public void mostrarInfo() {
		super.MostrarInfo();
		System.out.println("Tienes una garatía de: "+garantiasMeses+ "meses");
		
	}
}
