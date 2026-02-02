package Repaso;


public class TemperaturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura[] registros= new Temperatura[7];
		registros[0]=new Temperatura(1, 2, 6);
		registros[1]=new Temperatura(2, 2, 8);
		registros[2]=new Temperatura(3, 2, 4);
		registros[3]=new Temperatura(4, 2, 2);
		registros[4]=new Temperatura(5, 2, 8);
		registros[5]=new Temperatura(6, 2, 5);
		registros[6]=new Temperatura(7, 2, 7);
		
		Temperatura min=registros[0];
		for(Temperatura registrado:registros) {
			if (registrado.getTemperatura()<min.getTemperatura()) {
				min=registrado;
			}
		}
		
		System.out.println("El día mínimo ha sido"+ min);
	}

}
