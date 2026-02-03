package Repaso;

public class Atleta {
	private int indentificador;
	private String nombre;
	private double tiempo;
	static int contadorAtleta=0;
	static String seleccion="España";
	static double tiempoEquipo;
	
	public Atleta(int indentificador, String nombre, double tiempo) {
		this.indentificador +=contadorAtleta;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	
	
}
