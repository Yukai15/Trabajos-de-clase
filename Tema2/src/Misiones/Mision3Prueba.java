package Misiones;

public class Mision3Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int energia[]=new int[10];
		energia[0]=(int)(Math.random()*(150-50+1)+50);
		int num_max=energia[0];
		int num_min=energia[0];
		int crones;
		
		for(int i=0; i<energia.length; i++) {
			energia[i]=(int)(Math.random()*(150-50+1)+50);
			System.out.println("El valor sería de "+ energia[i]);	
		}
		for(int i=0; i<energia.length; i++) {
			if(num_max<energia[i]) {
				num_max=energia[i];
			}
			if(num_min>energia[i]) {
				num_min=energia[i];
			}
		}
		int suma=0;
		for(int i=0; i<energia.length; i++) {
			suma +=energia[i];
			
		}int promedio= suma/energia.length;
		System.out.println("min: " + num_min + " max: " + num_max +" promedio: " +promedio);
		
		if(num_max<=140) {
			System.out.println("¡Alerta! Pico de energía crítico detectado, riesgo de ruptura tempora");
		}
		if(num_min>=95) {
			System.out.println("Advertencia: nivel de energía bajo detectado, posible debilitamiento del portal.");
		}
		if(num_min<=95 && num_max>=140){
			System.out.println("El flujo es estable");
			crones +=5;
		} else {
			System.out.println("Inestabilidad detectada, es necesaria la recalibración");
		}
	}

}
