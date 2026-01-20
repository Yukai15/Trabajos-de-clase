package Libro;

public class libro {

	int prestamo;
	int devolucion;
	int ejemplares;
	String titulo;
	String autor;
	
	libro(int prestamo,int devolucion, int ejemplares,String titulo, String autor) {
	this.prestamo=prestamo;
	this.devolucion=devolucion;
	this.titulo=titulo;
	this.autor=autor;
	
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	int getPrestamo() {
		return prestamo;
	}

	void setPrestamo(int prestamo) {
		this.prestamo = prestamo;
	}
	public boolean prestamo() {
		if (ejemplares>0) {
			ejemplares=-1;
			prestamo=+1;
			return true;
		}
		return false;
	}

	int getDevolucion() {
		return devolucion;
	}

	void setDevolucion(int devolucion) {
		this.devolucion = devolucion;
	}
	public boolean devolucion() {
		if (ejemplares>0) {
			prestamo=-1;
			devolucion=+1;
			ejemplares=+1;
			return true;
		}
		return false;	
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
