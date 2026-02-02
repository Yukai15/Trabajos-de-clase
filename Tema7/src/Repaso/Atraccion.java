package Repaso;

public class Atraccion {
	private String nombre;
	private int alturaMinima;

	public Atraccion(String nombre, int alturaMinima ) {
		this.nombre = nombre;
		this.alturaMinima = alturaMinima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlturaMinima() {
		return alturaMinima;
	}

	public void setAlturaMinima(int alturaMinima) {
		this.alturaMinima = alturaMinima;
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", alturaMinima=" + alturaMinima + "]";
	}
	
	

}