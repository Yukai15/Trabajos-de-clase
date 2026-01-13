
public class Vehículo2 {
	/*
	 * Instancie el objeto Monovolumen de la clase vehículo.
		Dale a sus atributos los valores :
 		marca = Renault
		modelo=Space
		pasajeros = 7
		capacidad = 50
		consumo =14
		Calcula la autonomía del vehículo con el depósito lleno.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehículos miVehiculo=new Vehículos();
		miVehiculo.marca="Renault";
		miVehiculo.modelo="Space";
		miVehiculo.numPasajeros=7;
		miVehiculo.capacidad= 50;
		miVehiculo.consumo= 14;
		double autonomia=miVehiculo.calcularAutonomia();
		System.out.println("El "+miVehiculo.marca+" "+miVehiculo.modelo+" tiene una autonomia de "+autonomia+" km ");
		
		Vehículos Deportivo=new Vehículos();
		Deportivo.marca="Lexus";
		Deportivo.modelo="F Sprort";
		Deportivo.numPasajeros=2;
		Deportivo.capacidad=66;
		Deportivo.consumo=18.8;
		double autonomiaDeportivo=Deportivo.calcularAutonomia();
		System.out.println("El "+Deportivo.marca+" "+Deportivo.modelo+" tiene una autonomia de "+autonomiaDeportivo+" km ");
		
		
	}

}
