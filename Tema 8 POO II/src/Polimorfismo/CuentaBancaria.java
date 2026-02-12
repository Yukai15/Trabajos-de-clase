package Polimorfismo;

public class CuentaBancaria {
	protected float Saldo;
	protected int ingresos=0;
	protected int retirado=0;
	protected float intereses;
	protected float comision=0;
	protected float tasa;
	public CuentaBancaria(float saldo, float tasa) {
		this.Saldo = saldo;
		this.tasa = tasa;
	}
	void Ingresar(float dinero) {
	ingresos++;
	this.Saldo += dinero;
	System.out.println("Se ha ingresado correctamente");
	}
	void Retirar(float dinero) {
	if (this.Saldo>dinero) {
		retirado++;
		this.Saldo -=this.retirado;
		System.out.println("Se ha retirado correctamente");
		}
	else {
		System.out.println("No puedes retirar más dinero de lo que tienes");
		}
	}
	void InteresMensual() {
	this.Saldo=Saldo+(tasa/100);
	}
	void ExtractoMensual() {
		this.Saldo-=comision;
		InteresMensual();
	}
	void Imprimir() {
		System.out.println("Tienes este saldo" +Saldo
				+ "\n 1.Has ingresado estas veces" + ingresos
				+ "\n 2.Has retirado estas veces" + retirado
				+ "\n 3.Tienes esto de interes" + intereses
				+ "\n 4.Tienes esto de comisiones " + comision);
	}
	
}
