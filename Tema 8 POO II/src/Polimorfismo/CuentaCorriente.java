package Polimorfismo;

public class CuentaCorriente extends CuentaBancaria {
	
	public CuentaCorriente(float saldo, float tasa) {
		super(saldo, tasa);
		// TODO Auto-generated constructor stub
	}
	public void Ingresar() {
		this.Saldo += this.ingresos;
		
		}
	public void Retirar(float descubierto) {
	retirado++;
	this.Saldo -= this.retirado;
	if(Saldo<=0) {
	descubierto += -Saldo;
		}
	}
	void ingreso(float dinero) {
		super.Ingresar(dinero);
	}
}
