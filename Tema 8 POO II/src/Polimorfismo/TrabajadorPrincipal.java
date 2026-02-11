package Polimorfismo;


public class TrabajadorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador[] t1=new Trabajador[3];
		t1[0]=new Trabajador("Bill Gates", "Presidente ", null);
		t1[1]=new Empleado("Larry Ellison", "Presidente", null, 100000, 1000, 1);
		t1[2]=new Consultor("Steve Jobs", "Consultor Jefe", null, 20,1000 );
		
		for (Trabajador a:t1) {
		System.out.println(a);	
			
		}
		for (Trabajador a:t1) {
		if(a.calcularPaga()!=0) {
			System.out.println("El empleado "+ a.getNombre()+" cobra "+a.calcularPaga());
			}
		}
	}

}
