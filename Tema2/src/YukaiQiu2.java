import java.util.Scanner;

public class YukaiQiu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tiempo= new Scanner(System.in);
		int cargaTemporal, crones=0,contador=0, energia, dia;
		boolean ayoBisiesto=false;
		do {
			System.out.println("-----CENTRO DE CONTROL TEMPORAL-----");
			System.out.println("1. Calibrar el portal");
			System.out.println("2. Establecer fecha del viaje");
			System.out.println("3. Mostrar carga temporal acumulado");
			System.out.println("4. Iniciar viaje");
			System.out.println("0. Salir");
			cargaTemporal=tiempo.nextInt();
			
			switch(cargaTemporal) {
			case 1:
				while(true) {
				System.out.println("Introduce la cantidad de energía: ");
				energia=tiempo.nextInt();
				if(energia>35) {
					System.out.println("La energía introducido es demasiado alta");
					contador++;
				}else if(energia<35) {
					System.out.println("La energía introducido es demasiado bajo");
					contador++;
				}else if(energia==35) {
					contador++;
					System.out.println("¡¡Acertaste en " + contador + " intentos!!");
					crones += 10;
					break;
				}
			}
			case 2: 
				System.out.println("-----Establecer fecha del viaje-----");
				while(true) {
					System.out.println("Introduce el día:");
					dia=tiempo.nextInt();
				if(dia==31 || dia==30 || dia==29|| dia==28) {
					ayoBisiesto=true;
				}
				System.out.println("");
				
		}
			tiempo.close();
		}
	}while(cargaTemporal!=0)

}
