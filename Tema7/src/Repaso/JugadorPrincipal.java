package Repaso;


public class JugadorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador[] jugadores= new Jugador[5];
		jugadores[0]=new Jugador("Yukai",15);
		jugadores[1]=new Jugador("Ismael",8);
		jugadores[2]=new Jugador("Ruth",6);
		jugadores[3]=new Jugador("Xavi",7);
		jugadores[4]=new Jugador("Chaniel",3);
		
		Jugador max=jugadores[0];
		for(Jugador gol:jugadores) {
			if (gol.getGoles()>max.getGoles()) {
				max=gol;
			}
		}
		System.out.println("El jugador que más ha marcado goles es " + max );
	}
	
}


