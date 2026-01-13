
public class Vehículos {

	String marca;
	String Deportivo;
	String modelo;
	int numPasajeros=4;
	int capacidad;
	double consumo;
	
	public double calcularAutonomia() {
	
		return capacidad*consumo;
	}
}
