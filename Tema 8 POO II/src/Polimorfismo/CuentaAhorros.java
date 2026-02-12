package Polimorfismo;

public class CuentaAhorros extends CuentaBancaria{
	
	private boolean ahorros=false;
	
	public CuentaAhorros(float saldo,float tasa) {
		super(saldo, tasa);
		ahorros=true;
	}
	
	public boolean isAhorros() {
		return ahorros;
	}

	public boolean setAhorros(boolean ahorros) {
		this.ahorros = ahorros;
		return ahorros;
	}

	@Override
	public void Ingresar(float ingresos) {
		if(ahorros) {
			super.Ingresar(ingresos);
			System.out.println("Se ha ingresado correctamente");
		}else {
			System.out.println("No se ha podido ingresar");
		}
	}
	@Override
	public void Retirar(float ingresos) {
		if(ahorros=true) {
			Saldo -=ingresos        ;
			System.out.println("Se ha retirado correctamente");
		}
		else {
			System.out.println("No se ha retirado correctamente");
		}
	}
	void Extarcto() {
		int ComisionPorOperacion=100;
		if(this.retirado>4) {
			Saldo -=ComisionPorOperacion;
		}
		isAhorros();
	}
	void Imprimir() {
		if (ahorros) {
			super.Imprimir();
		}
	}
	
}
