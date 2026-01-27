package org.barajas.ies.myapp.starter;

import java.io.File;

public class BootApp {

	public static void main(String[] args) {
		// 1. Argumentos del programa.- Son los argumentos 
		// de la línea de comandos que se pasan directamente
		// a la aplicación. Son iguales a si se ejecutara el 
		// programa desde la línea de comandos e ingresara parámetros.
		System.out.println("El número de argumentos introducido al ejecutar el programa es: " + args.length);
		System.out.println("Y estos serían: ");
		for (String argumento: args) {
			System.out.println("\t " + argumento);
		}
		
		// 2. Argumentos de VM.- Son argumentos se pasan a la 
		// máquina virtual Java (JVM) que ejecuta su aplicación, 
		// y a menudo se utilizan para establecer propiedades o 
		// configuraciones de memoria para la propia JVM.
		// Como por ejemplo "Propiedades del sistema".- Se pueden
		// definir propiedades accesibles mediante 
		// System.getProperty("property.name")
		// Ejecutando la máquina virtual java con el argumento: 
		// -Dauthor=value
		String propiedadSistema = System.getProperty("author");
		if (propiedadSistema != null) {
			System.out.println("\"Propiedad del sistema que identifica al autor de dicha práctica: \" \"author\" definida cuándo se creó la JVM que arranco este programa tiene el valor: " + propiedadSistema);
		}
		
		// 3. Variables de entorno.- Son variables de sistema a las que 
		// la aplicación puede acceder mediante 
		// System.getenv("ENV_VAR_NAME"). 
		System.out.println("La variable de entorno PATH contiene las siguientes rutas: ");

		// Convertimos el String que contiene el valor de la variable de entorno PATH
		// en un array de "Strings" (utilizaremos el método "split" de la clase "String") 
		// Ver: "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-"
		//for (String ruta: System.getenv("PATH").split(File.pathSeparator)) {
		//System.out.println("\t " + ruta);
		
			
		System.out.println("\t"+System.getenv("NUMBER_OF_PROCESSORS"));
		System.getenv("La variable de entorno OS contiene:   ");
		System.out.println("\t"+System.getenv("OS"));
		}
	}
