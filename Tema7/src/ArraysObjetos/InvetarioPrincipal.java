package ArraysObjetos;

import java.util.Scanner;

public class InvetarioPrincipal {
	static Inventario [] articulo=new Inventario[5];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=sc.nextInt();
		do {
			System.out.println("---Menú Inventario---"
					+ "n\1. Mostrar todos los artículos"
					+ "n\2. Mostrar los artículos con menos de 5 unidades"
					+ "n\3. Aumentar stock de un artículo"
					+ "n\4. Disminuir stock de un artículo"
					+ "n\5. Salir");
		
		switch(op) {
		
		case 1:
		mostrarArticulos();
		case 2:
		menosCinco();
		case 3:
		aumentarStock();
		sc.nextLine();
		case 4:
		disminuirStock();
		sc.nextLine();
		case 5:
		salir();
		
		default:
			System.out.println("¡Hasta luego!");		
		}	
		}while(op !=5);
	}
	public void ropa() {
		articulo[0] = new Inventario("zapatos", 6, 120);
		articulo[1] = new Inventario("camisetas", 8, 30);
		articulo[2] = new Inventario("pantalones", 5, 40);
		articulo[3] = new Inventario("sudaderas", 3, 50);
		articulo[4] = new Inventario("mochila", 4, 60);
	}
	public static void mostrarArticulos() {
		for(Inventario productos:articulo)
		System.out.println(productos);
	}
	public static void menosCinco() {
		for(Inventario productos:articulo) {
			if(productos.getStock()<5) {
				System.out.println();
			}
		}
	}
	public static void aumentarStock() {
		System.out.println("Introduce el nombre del artículo para aumentar el stock ");
		String palabra=sc.next();
		for(Inventario productos:articulo) {
			productos.getNombre().equalsIgnoreCase(palabra);
			System.out.println("Introduce la cantidad que quieres aumentar ");
			int cantidad=sc.nextInt();
			productos.aumento(cantidad);
			System.out.println("El stock de " + palabra + "ahora es " + cantidad);
			break;
		}
	}
	
	public static void disminuirStock() {
		System.out.println("Introduce el nombre del artículo para aumentar el stock ");
		String palabra2=sc.next();
		for(Inventario productos:articulo) {
			productos.getNombre().equalsIgnoreCase(palabra2);
			System.out.println("Introduce la cantidad que quieres aumentar ");
			int cantidad2=sc.nextInt();
			productos.disminuir(cantidad2);
			System.out.println("El stock de " + palabra2 + "ahora es " + cantidad2);
			break;
		}
	}
	public static void salir() {
		System.out.println("Saliendo del sistema...");

	}
}

	