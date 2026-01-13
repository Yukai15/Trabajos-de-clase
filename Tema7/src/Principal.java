
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas p1=new Personas();
		p1.nombre="María";
		p1.edad=20;
		p1.saludar();
		
		Perro perro1=new Perro();
		perro1.nombre="Max";
		perro1.color="Blanco";
		perro1.raza="Propia";
		perro1.tamanio="Mediano";
		System.out.println("el perro"+perro1.nombre+"está");
		perro1.labrar();
		perro1.comer();
		
		Perro perro2=new Perro();
		perro2.nombre="Jak";
		perro2.raza="Podenco";
		perro2.color="negro";
		perro2.tamanio="Grande";
		System.out.println("el perro"+perro2.nombre+"está");
		perro2.jugar();
	}

}
