package Misiones;

import java.util.Scanner;

public class Mision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        int cargaTemporal, crones = 0, contador = 0, energia, dia = 0, mes = 0, ayo = 0;
        int  energiaCorrecta=(int)((Math.random()*150-10)+10), intentos=6;
        String palabrasecreta=("CRONOS"), letra , palabraOculta="", letrasMostrar= "";
        boolean ayoBisiesto = false, portalCalibrado = false, coordenadasCorrecto = false, letraCorrecta=false;
        boolean palabraDescifrada = false;
        do {
            
            System.out.println("-----CENTRO DE CONTROL TEMPORAL-----");
            System.out.println("1. Calibrar el portal");
            System.out.println("2. Establecer fecha del viaje");
            System.out.println("3. Mostrar carga temporal acumulado");
            System.out.println("4. Iniciar viaje");
            System.out.println("5. Descifrar la clave temporal");
            System.out.println("6. Control energía");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            cargaTemporal = leer.nextInt();

            switch (cargaTemporal) {

            
            case 1://La energía para el portal
                contador = 0;
                while (true) {
                    System.out.print("Introduce la cantidad de energía: ");
                    energia = leer.nextInt();
                    contador++;
                    //Debeser mayor de 35 La energía para poder continuar
                    if (energia > energiaCorrecta) {
                        System.out.println("La energía introducida es demasiado alta.");
                    } else if (energia < energiaCorrecta) {
                        System.out.println("La energía introducida es demasiado baja.");
                    } else {
                        System.out.println("¡¡Acertaste en " + contador + " intentos!!");
                        crones += 10;	//Al conseguir acertar te da 10 crones												 
                        portalCalibrado = true;	//y da true a portalCalibre para verificar que lo ha hecho										
                        break;
                    }
                }
                break;

            
            case 2://Las coordenadas
                System.out.println("-----Establecer fecha del viaje-----");
                System.out.print("Introduce el día: ");
                dia = leer.nextInt();
                System.out.print("Introduce el mes: ");
                mes = leer.nextInt();
                System.out.print("Introduce el año: ");
                ayo = leer.nextInt();

                // Comprobación básica de mes y año
                if (mes < 1 || mes > 12) {
                    coordenadasCorrecto = false;
                } else {
                    // Determinar si el año es bisiesto
                    ayoBisiesto = (ayo % 4 == 0 && ayo % 100 != 0) || (ayo % 400 == 0);
                    int diasMes = 31;

                    // Asignar número de días según el mes
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        diasMes = 30;
                    } else if (mes == 2) {
                        diasMes = (ayoBisiesto) ? 29 : 28;
                    }

                    // Validar día
                    if (dia >= 1 && dia <= diasMes) {
                        coordenadasCorrecto = true;
                    } else {
                        coordenadasCorrecto = false;
                    }
                }

                // Mostrar resultado y te da 5 crones
                if (coordenadasCorrecto) {
                    System.out.println("Las coordenadas son estables.");
                    crones += 5;
                } else {
                    System.out.println("Las coordenadas son inestables.");
                }
                break;

            
            case 3: //Comprueba si has hecho el 1 y 2 poder mostrar los crones que tienes
                if (!portalCalibrado && !coordenadasCorrecto) { //Cuando esta mal te muestra error
                    System.out.println(
                            "Aún no has calibrado o no has establecido coordenadas válidas. tienes 0 energías");
                } else {
                    System.out.println("Tu carga temporal es de " + crones + " crones.");
                }
                break;

            
            case 4:// Para iniar viaje
                System.out.println("Activando portal...");//Comprueba si ha hecho los demás casos para activar el portal
                if (!portalCalibrado) {
                    System.out.println("Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.");
                } else if (!coordenadasCorrecto) {
                    System.out.println("Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.");
                } else if (crones < 10) {//Cuando tienes menos de 10 cronos no puedes iniciar el viaje
                    System.out.println("Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.");
                } else {
                    crones -= 10;//Gastas 10 crones para poder viajar
                    System.out.println("Coordenadas estables...");
                    System.out.println("¡El salto temporal ha sido un éxito!");
                }
                break;
               
            case 5:
                
                // Inicializar palabra oculta con asteriscos
                for (int i = 0; i < palabrasecreta.length(); i++) {
                    palabraOculta += "*"; 
                }

                leer.nextLine(); // limpiar buffer

                while (intentos > 0 && !palabraDescifrada) { // Hace que el bucle cumpla las condiciones
                    letraCorrecta = false;
                    letrasMostrar = "";
                    //El menú del caso 5 
                    System.out.println("Palabra: " + palabraOculta);
                    System.out.println("Intentos restantes: " + intentos);
                    System.out.print("Introduce una letra: ");
                    letra = leer.nextLine().toUpperCase();// si la letra está en minuscula lo convierte en mayúscula


                    // Reemplazar letras correctas
                    for (int i = 0; i < palabrasecreta.length(); i++) {
                        if (palabrasecreta.charAt(i) == letra.charAt(0)) {
                            letrasMostrar += letra.charAt(0);
                            letraCorrecta = true;
                        } else {
                            letrasMostrar += palabraOculta.charAt(i);
                        }
                    }
                    //Si las letras coinciden con la palabra secreta 
                    palabraOculta = letrasMostrar;
                    // Pondran las letras dependiendo si son correctas o no
                    if (letraCorrecta) {
                        System.out.println("¡Letra correcta!");
                    } else {
                        System.out.println("Letra incorrecta.");
                        intentos--;
                    }
                    //Ignorara si las palabras son mayúsculas o mínusculas que si serviran 
                    if (palabraOculta.equalsIgnoreCase(palabrasecreta)) {
                        System.out.println("¡Has ganado! La palabra secreta es CRONOS"); //Cuando acierta la palabra
                        palabraDescifrada = true;
                        crones += 15;
                    }
                }

                if (intentos==0) {// Si no aciertan la palabra colapsara
                    System.out.println("Colapso temporal... la palabra era CRONOS");
                }
                break;
            case 6:
                int arrays[]=new int[10];
        		arrays[0]=(int)(Math.random()*(150-50+1)+50);
        		int num_max=arrays[0];
        		int num_min=arrays[0];
            	for(int i=0; i<arrays.length; i++) { 
            		arrays[i]=(int)(Math.random()*(150-50+1)+50);//El sensor temporal entre 50 y 150
        			System.out.println("El valor sería de "+ arrays[i]);
        			num_min=Math.min(num_min, arrays[i]);//número mínimo
        			num_max=Math.max(num_max, arrays[i]);//número máximo
        		}
        		int suma=0;
        		for(int i=0; i<arrays.length; i++) {// Este for sirve para sumar y hacer promedio
        			suma +=arrays[i];
        		}int promedio= suma/arrays.length;
        		System.out.println("min: " + num_min + " max: " + num_max +" promedio: " +promedio);
        		
        		if(num_max>140) {// Si es mayor de 140 se va a producir este mensaje 
        			System.out.println("¡Alerta! Pico de energía crítico detectado, riesgo de ruptura tempora");
        		}
        		if(num_min<95) {// Si es menor de 95 se va a producir este mesaje 
        			System.out.println("Advertencia: nivel de energía bajo detectado, posible debilitamiento del portal.");
        		}
        		if(promedio>=90 && promedio<=110){// El flujo será estable si es correcto ñas condiciones y se sumara crones
        			System.out.println("El flujo es estable");
        			crones +=5;
        		} else {// sino cumple se dara este mensaje
        			System.out.println("Inestabilidad detectada, es necesaria la recalibración");
        		}break;
            		
            	
            case 0: // 0 para el proceso y salir del proceso
                System.out.println("Desconectando sistema temporal... Hasta el próximo salto.");
                break;


            default://Por si no da a ninguno de los números que da en el menú principal
                System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4.");
                break;
            }

        } while (cargaTemporal != 0);//Cuando apriestas el 0 al inicio y no iniciar el viaje

        leer.close();
    }

		
	}

	






	


