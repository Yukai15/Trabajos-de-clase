package Repaso;

import java.util.Arrays;

public class Cientifico {
	private String nombre;
	private String autor;
	private String[] palabraClaveString;
	private String publicacion;
	private int anyo;
	private String resumen;
	
	public Cientifico(String nombre, String autor) {
		this.nombre = nombre;
		this.autor = autor;
	}
	public Cientifico(String nombre, String autor,String[] palabraClaveString,String publicacion,int anyo) {
		this(nombre, autor);
		this.palabraClaveString=palabraClaveString;
		this.publicacion=publicacion;
		this.anyo=anyo;
	}
	
	
	public Cientifico(String nombre, String autor, String[] palabraClaveString, String publicacion, int anyo,
	String resumen) {
	this(nombre, autor, palabraClaveString, publicacion, anyo);
	this.resumen=resumen;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String[] getPalabraClaveString() {
		return palabraClaveString;
	}
	public void setPalabraClaveString(String[] palabraClaveString) {
		this.palabraClaveString = palabraClaveString;
	}
	public String getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public String soloPalabras() {
		String palabra="";
		for(int i=0; i<this.palabraClaveString.length;i++) {
			palabra +="\n*"+palabraClaveString[i];
		}
		return palabra;
	}
	@Override
	public String toString() {
		return "Cientifico [nombre=" + nombre + "\n autor=" + autor + "\n palabraClaveString="
				+ Arrays.toString(palabraClaveString) + "\n publicacion=" + publicacion + "\n anyo=" + anyo + "\n resumen="
				+ resumen + "]";
	}
	
}
	

