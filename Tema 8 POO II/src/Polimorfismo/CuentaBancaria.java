package Polimorfismo;

public class CuentaBancaria {
	protected float Saldo;
	protected int ingresos=0;
	protected int retirado=0;
	protected float intereses;
	protected float comision=0;
	public CuentaBancaria(float saldo, int ingresos, int retirado, float intereses, float comision) {
		Saldo = saldo;
		this.ingresos = ingresos;
		this.retirado = retirado;
		this.intereses = intereses;
		this.comision = comision;
	}
	public float getSaldo() {
		return Saldo;
	}
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
	public int getIngresos() {
		return ingresos;
	}
	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}
	public int getRetirado() {
		return retirado;
	}
	public void setRetirado(int retirado) {
		this.retirado = retirado;
	}
	public float getIntereses() {
		return intereses;
	}
	public void setIntereses(float intereses) {
		this.intereses = intereses;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	public void Ingresar() {
	this.Saldo += this.ingresos;
	}
	public void Retirar() {
	
	if (this.Saldo<this.retirado) {
	System.out.println("No puedes retirar más dinero de lo que tienes");
		}
	else {
		this.Saldo -=this.retirado;
		}
	}
	public void InteresMensual(int tasaAnual) {
	tasaAnual=10;
	this.Saldo=Saldo+(tasaAnual/100);
	}
	public void ExtractoMensual(double comision) {
		comision=this.retirado*0.10;
		InteresMensual(ingresos);
	}
	public void Imprimir() {
		
	}
	@Override
	public String toString() {
		return "CuentaBancaria [Saldo=" + Saldo + ", ingresos=" + ingresos + ", retirado=" + retirado + ", intereses="
				+ intereses + ", comision=" + comision + "]";
	}
}
