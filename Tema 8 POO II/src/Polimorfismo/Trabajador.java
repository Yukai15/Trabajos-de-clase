package Polimorfismo;

public class Trabajador {
	private String nombre;
	private String puesto;
	private String direccion;
	
	
	public Trabajador(String nombre, String puesto, String direccion) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + "]";
	}

	public double calcularPaga() {
		return 0;
	}
	
}
