/**
 * 
 */
package examen;

import java.util.Scanner;

/**
 * 
 */
public class Chavez_Farid_examen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner leer = new Scanner(System.in);//Para poder 
		
	    //Declaro las variables que voy a utilizar fuera de los "case" para poder utilizarlos en estos
		int num;//numero que se va a utilizar para elegir una opcion
		int contcrones=0;//esta es la cantidad de crones
		int fechav=0;//declaro una fechav para poder comprobar en el case 2 y 4, y no dea ningun problema 
		int energia=0;
		
		//Con el do-while hago que el menu creado con syso se repita hasta que el numero que se ingrese sea 0
		do {
			
		System.out.println("---CENTRO DE CONTROL TEMPORAL---");
		System.out.println("1.Calibrar el portal");
		System.out.println("2.Establecer fecha del viaje");
		System.out.println("3.Mostrar carga temporal acumulada");
		System.out.println("4.Iniciar viaje");
		System.out.println("5.Descifrar clave temporal");
		System.out.println("6.Control de energia");
		System.out.println("7.Verificacion de identificadores");
		System.out.println("0.SALIR");
		System.out.println("-----------------------------------");
		System.out.println("Elige una opcion");
		num=leer.nextInt();//con esto leemos el numero introducido
		
		//El switch ,con el num que se ha introducido, realizara el case que se haya elegido
		switch(num) {
		
		case 1: 
			System.out.println("===========================");
			System.out.println("Calibrar portal");
			System.out.println("===========================");
			int cont=0;//Declaro un contador para el numero de intentos al calibrar el portal
			
			//con el do-while hago que se repita hasta que sea la cantidad correcta que seria 35,y esto lo hago con los if
			//cada vez que se repite se suma al contador de intentos para poder mostralo luego
			do {System.out.println("Introduce la cantidad de energia: ");
			energia=leer.nextInt();
			cont=cont+1;
			if(energia>35) {System.out.println("la energia introducida es demasiado alta");}
			else if(energia<35) {System.out.println("la energia introducida es demasiado baja");}}
			
			while(energia!=35);
			System.out.println("acertaste en "+cont+" intentos");
			contcrones=contcrones+10;
			break;
		
		
		case 2: 
			System.out.println("===========================");
			System.out.println("Establecer fecha del viaje");
			System.out.println("===========================");
			System.out.println("Introduce el dia: ");
			
			//declaro las variables que utilizare en este case
			int dia=leer.nextInt();
			System.out.println("Introduce el mes:");
			int mes=leer.nextInt();
			System.out.println("Introduce el año");
			int año=leer.nextInt();
			
			int diasm=0;//declaro esto para poder establecer cuantos dias hay en determinado mes
			switch(mes) {case 1: case 3: case 5: case 7: case 8: case 10: case 12://estos son los meses que tienen siempre 31
			diasm=31;
			break;
			case 4: case 6: case 9 : case 11://estos son los meses que tienen siempre 30
			diasm=30;
			break;
			case 2:
			if((año%4 == 0 && año%100 != 0)||año%400 == 0) {diasm=29;}//con este if compruebo si el año es biciesto ,y si lo es pues serian 29
			else {diasm=28;}//sino pues serian 28
			break;
			default: diasm=0;//por si el usuario introduce un numero invalido
			}
			if (mes<1||mes>12||dia<1|| dia>diasm) {System.out.println("Las coordenadas son inestables");}//compara si los datos introducidos son validos
			else {System.out.println("Las coordenadas son estables");
			contcrones=contcrones+5;//lo que suma al contador de cornes
			fechav=1;//para poder comprobar al final si la fecha es valida
			}
			
			break;
			
		
		case 3:
			System.out.println("===========================");
			System.out.println("Carga temporal acumulada");
			System.out.println("===========================");
			System.out.println("tu carga temporal es de "+contcrones+" crones");//para mostrar la cantidad de crones
		break;
		
		
		case 4:
			System.out.println("===========================");
			System.out.println("INICIAR VIAJE TEMPORAL");
			System.out.println("===========================");
			
			//Aqui se comprueba todos si todo lo introducido es valido 
			if (energia!=35) {System.out.println("Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.");}
			else if(fechav==0) {System.out.println("Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.");}
			else if(contcrones<10) {System.out.println("Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.");}
		
			else {
				System.out.println("\"" + "activando portal...");
				System.out.println("Coordenadas Estables...");
				System.out.println("¡Salto temporal relaizado con exito!"+"\"");
				contcrones=contcrones-10;}//al momento que se comprueba todo y sale bien se restan con esto 10 crones 
			break;
		
		case 7:
			String IV="IV";
			String TT="BCDEFGHJKLMNPQRSTVWXYZ";
			char letra;
			int posicion=0;
			
			int XXXX;
			
			String A="AEIOU";
			char Letra1;
			int posicion1=0;
			
			
		
			
			//numeros aleatorios
			for(int i=0;i<4;i++) {System.out.println("IV");
				XXXX=(int) (Math.random()*9999+1000);
			System.out.print("-"+XXXX);
			//TT aleatorio
			for(int j=0;j<2;j++) {posicion=(int)(Math.random()*21+0);
				letra= TT.charAt(posicion);
				}
			//A ALetaorio
			for(int k=0;k<1;k++) {posicion1=(int)(Math.random()*4+0);
			Letra1=A.charAt(posicion1);
			}
			
			for(int l=0;l<4;l++) {System.out.println();}
			
			
			}
			
			
			
			
		
			break;
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		case 0:
			System.out.println("Desconectando sistema temporal... Hasta el próximo salto");
		break;
		default:System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4");//aparece cuando no se introduce una opcion valida 
		
		}
		}while(num!=0);
		leer.close();
	}

}
