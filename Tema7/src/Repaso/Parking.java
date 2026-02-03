package Repaso;

public class Parking {
	private String matricula;
	private String marca;
	
	public Parking(String matricula, String marca) {
		this.matricula = matricula;
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void mostrarInfo() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return   matricula + "-" + marca;
	}
	
}
