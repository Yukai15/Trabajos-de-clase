package Polimorfismo;

public class Trabajador2 extends Persona {
	private CategoriaProfesional categoria;
	private int antiguedad;
	
	Trabajador2() {
	this.categoria=CategoriaProfesional.A;
	}	
	
	public Trabajador2(String nombre,String telefono,int edad) {
		super(nombre,telefono,edad);
		this.categoria=categoria;
		this.antiguedad=antiguedad;
	}

	public CategoriaProfesional getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProfesional categoria) {
		this.categoria = categoria;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Trabajador2 [categoria=" + categoria + ", antiguedad=" + antiguedad + "]";
	}
}

