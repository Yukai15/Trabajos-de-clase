package Ejercicio5;

import java.util.Scanner;

public class cuentaBancaria {
	/*
	 * Ingresar dinero: método que recibirá como parámetro el dinero a ingresar (double), actualizará el campo saldo añadiéndole el importe y devolverá el saldo resultante. 
Sacar dinero : igual que el anterior. 
Mostrar saldo: mostrará por pantalla el saldo de la cuenta
Modificar datos de la cuenta:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		cuentaCorriente miCuenta=new cuentaCorriente();
		miCuenta.nombre="Yukai";
		miCuenta.apellido="Qiu";
		miCuenta.dni="83472615-M";
		miCuenta.numCuenta=15406746;
		miCuenta.saldo=500;
		
		int opciones;
		do {
		System.out.println("Bienvenido a MiBanco");
		System.out.println("1.Ingresar dinero");
		System.out.println("2.Sacar dinero");
		System.out.println("3.Mostrar saldo");
		System.out.println("4.Modificar datos de la cuenta");
		System.out.println("5.Salir");
		opciones=sc.nextInt();
			switch(opciones) {
			case 1:
				System.out.println("¿Cuanto dinero desea ingresar?");
				int importe=sc.nextInt();
				miCuenta.ingresarDinero(importe);
				System.out.println("Operacion con exíto");
				break;
			case 2:
				System.out.println("¿Cuanto dinero desea sacar?");
				int exportar=sc.nextInt();
				miCuenta.sacarDinero(exportar);
				System.out.println("Operacion con exíto");
				break;
			case 3:
				miCuenta.mostrarSaldo();
				break;
			case 4: 
				System.out.println("¿Qué desea modificar?");
				miCuenta.modificarDatosCuenta();
				break;
			case 5: 
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opción no valido");
			}
		}while(opciones !=5);
		sc.close();
	}

}
