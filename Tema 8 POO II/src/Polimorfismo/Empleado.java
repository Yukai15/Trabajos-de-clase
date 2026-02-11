package Polimorfismo;

public class Empleado extends Trabajador {
	protected double sueldo;
	protected int impuestos;
	protected int pagas;
	
	public Empleado(String nombre, String puesto, String direccion, double sueldo, int impuestos, int pagas) {
		super(nombre, puesto, direccion);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
		this.pagas = pagas;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(int impuestos) {
		this.impuestos = impuestos;
	}

	public int getPagas() {
		return pagas;
	}

	public void setPagas(int pagas) {
		this.pagas = pagas;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", pagas=" + pagas + "]";
	}
	
	public double calcularPaga() {
		return (sueldo-impuestos)/pagas;
	}
	
}
