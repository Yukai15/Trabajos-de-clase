package Polimorfismo;

public class TrabajadorPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador2 t1=new Trabajador2();
		t1.setNombre("David");
		t1.setEdad(40);
		t1.setTelefono("666555444");
		t1.setAntiguedad(2);
		t1.setCategoria(CategoriaProfesional.C);
		
		Trabajador2 t2=new Trabajador2("Juan",30,"635958625",3,CategoriaProfesional.B);
		System.out.println(t1);
		System.out.println(t2);
		
		if (t1.getAntiguedad()>t2.getAntiguedad()) {
			System.out.println("El más antiguo es "+ t1.getNombre());
		}
		if (t2.getAntiguedad()>t1.getAntiguedad()) {
			System.out.println("El más antiguo es "+t2.getNombre());
		}
	}

}
