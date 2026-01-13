import java.util.Arrays;

public class TiendaGolosinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] golosinas = {
				{"KitKat", "Huesitos","Lacasitos","Palotes"},
				{"Kinder Bueno","Bolsa variada Haribo","Cheetos","Pelotazos"},
				{"Kinder Bueno","M&M'S", "Lays", "Chicles de menta"},
				{"Lacasitos", "Crunch", "Milkybar","Conguitos"},
				{"Chicles de fresa","Lays","Risketos","Pipas baconeras"}
				};
		double[][] precios=new double[golosinas.length][golosinas[0].length];
		int [][]cantidad=new int[golosinas.length][golosinas[0].length] ;
		for(int i=0; i<golosinas.length;i++) {
			for(int j=0;j<golosinas[i].length;j++) {
			Arrays.fill(cantidad[j], 5);
			}	
		}
		for(int i=0;i<precios.length;i++) {
			for(int j=0;j<precios[i].length;j++) {
				if(j%2==0) {
				precios[i][j]=0.85;	
				}
				else {
					precios[i][j]=1.15;
				}
			}
		}
		do {
			System.out.println("*********************************************************");
			System.out.println("Bienvenid@ a Daw Candy 2025. Selecciona una opción:");
			System.out.println("1. Pedir golosina");
			System.out.println("2. Mostrar golosinas");
			System.out.println("3. Rellenar golosinas");
			System.out.println("4. Apagar");
			System.out.println("*********************************************************");

			
			
			
		}while()
		
	}

}
