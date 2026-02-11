package Polimorfismo;

public class Persona {
	private String nombre;
	private String telefono;
	private int edad;
	
	Persona() {
		
	}

	public Persona(String nombre, String telefono, int edad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + "]";
	}
	
	
}
