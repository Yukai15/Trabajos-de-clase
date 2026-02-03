package Repaso;


public class ParkingPrincipal {
	final static int capacidad=10;
	static Parking[]parkines=new Parking[capacidad];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aparcar(new Parking("1234PLD", "Seat"));
		aparcar(new Parking("5613", "Dacia"));
		mostrarParking();
		sacar("1234PLD");
		mostrarParking();
	}
	public static void aparcar(Parking coche) {
		boolean b_lleno=true;
		for(int i=0;i<capacidad;i++) {
			if(parkines[i]==null) {
				parkines[i]=coche;
				b_lleno=false;
				System.out.println("Coche aparcado en la plaza");
				break;
			}
		}
		if (b_lleno) {
			System.out.println("el parking está lleno");
		}
	}
	
	public static void mostrarParking() {
		int numPlazas=0;
		for (Parking coche:parkines) {
			if (coche==null) {
				System.out.println("Plaza "+numPlazas+ " Libre");
			}
			else {
				System.out.println("Plaza "+ numPlazas +coche);
			}
			numPlazas++;
		}
	}
	public static void sacar(String matricula) {
		boolean cocheRetirado=false;
		for(int i=0;i<capacidad;i++) {
			if (parkines[i].getMatricula().equals(matricula)) {
				parkines[i]=null;
				cocheRetirado=true;
				System.out.println("El coche que has puesto se ha retirado correctamente"+parkines[i]);
				break;
			}
			if (!cocheRetirado) {
				System.out.println("el coche no sea encontrado");
			}
		}
	}
}
