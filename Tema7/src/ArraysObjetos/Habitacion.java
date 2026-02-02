package ArraysObjetos;

public class Habitacion {
	
	private int numero;
	private boolean ocupada;
	
	
	public Habitacion(int numero, boolean ocupada) {
		super();
		this.numero = numero;
		this.ocupada = ocupada;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", ocupada=" + ocupada + "]";
	}
	
}
