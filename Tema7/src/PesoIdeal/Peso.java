package PesoIdeal;

import ClaseNif.Nif;

public class Peso {

	static private char Hombre='H';
	static private char Mujer='M';
	static private char Otros='O';
	
	static private double peso_debajo=1;
	static private double peso_encima=-1;
	static private double peso_ideal=0;
	
	private String nombre;
	private int edad=0;
	private Nif nif;
	private char sexo=Hombre;
	private double peso=0;
	private double altura=0;

	Peso() {
	}
		Peso(int edad, double peso, double altura) {
			super();
			this.edad = edad;
			this.peso = peso;
			this.altura = altura;
		}
		Peso(String nombre, int edad, char sexo, double peso, double altura) {
			this.nombre=nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}

	public int calcularIMC() {
	double imc=this.peso/(this.altura*this.altura)
		if(imc<18.5) {
			return peso_debajo
		}
		if(imc)
			public boolean esMayorDeEdad() {
			boolean esMayor=(this.edad);
			return esMayor;
		}
		public String toString() {
		
		}
		private void generarDNI() {
			long dni=(long)(Math.random()*100000000);
		}
		

}
