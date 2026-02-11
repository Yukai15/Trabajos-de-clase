package Polimorfismo;

public class Consultor extends Trabajador {
	protected int horas;
	protected int tarifa;
	public Consultor(String nombre, String puesto, String direccion, int horas, int tarifa) {
		super(nombre, puesto, direccion);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga() {
		 return horas*tarifa;
	}
}
