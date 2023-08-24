/*Vas a hacer un programa ordenado, con funciones, para calcular el
porcentaje de asistencias de un estudiante. Primero que nada, solicitá el
nombre y apellido del alumno.
Luego, los pasos que te voy a indicar, hacelos dentro de una función
porcentajeAsistencias ():

• Pedir la cantidad de asistencias del alumno.
• También solicitar la cantidad de clases totales.
• Dividir la cantidad de asistencias sobre las clases totales.
• Retornar en la función porcentajeAsistencias () el porcentaje de
asistencias.
• Ahora, mostrá en pantalla el porcentaje de asistencias*/


package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {
	
static String nombre, apellido;
	static float n1, n2;
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese el nombre : ");
	    nombre =  entrada.next();
	    System.out.println("Ingrese el apellido : ");
	    apellido=  entrada.next();
	}
	
	public static float porcentajeAsistencia (float a, float b) {
		Scanner entrada = new Scanner(System.in);
	   
		  System.out.println("Ingrese la cantidad de asistencia: ");
		      n1 =  entrada.nextFloat();
		    System.out.println("Ingrese la cantidad de clases : ");
		    n2 =  entrada.nextFloat();
		   
		    float base = (n1/n2) * 100;
		    return base;
		    
	}

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    System.out.println("El porcentaje de asistencia es: " + porcentajeAsistencia(n1,n2));
	    
	}
}
