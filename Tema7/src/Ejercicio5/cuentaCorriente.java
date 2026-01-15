package Ejercicio5;

import java.util.Scanner;

public class cuentaCorriente {

	String nombre;
	String apellido;
	String dni;
	String direccion;
	long numCuenta;
	double saldo;
	
	double ingresarDinero(double importe) {
		saldo +=importe;
		return saldo;
	}
	double sacarDinero(double importe) {
		saldo -=importe;
		return saldo;
	}
	void mostrarSaldo() {
		System.out.println("El saldo de la cuenta es de: "+saldo);
	}
	void modificarDatosCuenta() {
		System.out.println("Datos de la cuenta: ");
		System.out.println("Nombre titular: "+nombre);
		System.out.println("Apellidos titular: "+ apellido);
		System.out.println("DNI: "+dni);
		System.out.println("Dirección: "+direccion);
		System.out.println("Saldo actual: "+saldo);
		Scanner sc=new Scanner(System.in);
		System.out.println("Qué quieres modificar? (1-Nombre, 2-Apellido, 3-DNI, 4-Dirección, 5-Saldo");
		int opciones=sc.nextInt();
		sc.nextLine();
		switch(opciones) {
		case 1: 
			System.out.println("Introduce el nombre: ");
			nombre=sc.next();
			System.out.println("El nombre ahora es: "+nombre);
			break;
		case 2:
			System.out.println("Introduce el apellido: ");
			apellido=sc.next();
			System.out.println("El apellido ahora es: "+apellido);
			break;
		case 3:
			System.out.println("Introduce el DNI: ");
			dni=sc.next();
			System.out.println("El DNI ahora es: "+dni);
			break;
		case 4:
			System.out.println("Introduce el direccion: ");
			direccion=sc.next();
			System.out.println("El direccion ahora es: "+direccion);
			break;
		default:
			System.out.println("Opción no válido");
		}
	}
}
