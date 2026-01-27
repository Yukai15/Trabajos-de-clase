package Entradas;

import java.util.Scanner;

public class entradasprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		entradas salaPrincipal=new entradas(1000);
		entradas zona = new entradas(250);
		entradas zonaVip=new entradas(25);
		
		do {
			System.out.println("======MADCOOL 2026======");
			System.out.println("1. Mostrar número de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3.Salir");
			switch(op) {
			case 1:
				System.out.println("Entradas principa" + salaPrincipal.getEntradasPorVender());
				System.out.println("Entradas zona" + zona.getEntradasPorVender());
				System.out.println("Entradas zonavip" + zonaVip.getEntradasPorVender());
			case 2:
				System.out.println("¿Qué entradas deseas?");
				System.out.println("1. salaPrincipal");
				System.out.println("2. zona");
				System.out.println("3. zonaVip");
				op=sc.nextInt();
				switch (op) {
				case 1: 
					System.out.println("salaPrincipal");
					System.out.println(entradas.vender);
					System.out.println("Hay " + salaPrincipal.getEntradasVendidas()+" entradas vendendidas");
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
			}
			
		} while (op !=3);
	}

}