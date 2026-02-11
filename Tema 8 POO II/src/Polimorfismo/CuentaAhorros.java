package Polimorfismo;

public class CuentaAhorros extends CuentaBancaria{
	private boolean ahorros=false;

	public CuentaAhorros(float saldo, int ingresos, int retirado, float intereses, float comision, boolean ahorros) {
		super(saldo, ingresos, retirado, intereses, comision);
		this.ahorros = ahorros;
	}

	public boolean isAhorros() {
		return ahorros;
	}

	public void setAhorros(boolean ahorros) {
		this.ahorros = ahorros;
	}
	
	@Override
	public void Ingresar() {
		if(ahorros= true) {
			Saldo +=ingresos;
		}
	}
	@Override
	public void Retirar() {
		if(ahorros=true) {
			Saldo -=retirado;
		}
	}
	void Extarcto() {
		if(this.retirado>4) {
			comision-100;
		}
	}
}
