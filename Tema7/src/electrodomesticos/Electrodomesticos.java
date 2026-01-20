package electrodomesticos;

public class Electrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico nevera= new Electrodomesticos("Frigorífico", "Candy", 80);
		
		System.out.println(nevera);
		System.out.println("Modificar la marca");
		nevera.setMarca("Corberó");
		System.out.println(nevera);
		System.out.println("En 5 horas este elctrodoméstico gastará" + nevera.getConsumo);
	}

}
