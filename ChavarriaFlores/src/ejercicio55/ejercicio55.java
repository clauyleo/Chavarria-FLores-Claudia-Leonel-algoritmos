package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {
	
	static float n1;
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un primer numero: ");
	    n1 =  entrada.nextInt();
	   
	}

	public static float alcuadrado (float a) { // parámetros: a y b
		float base = a * a;
	    return base;
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    alcuadrado(n1);
	    System.out.println("El resultado de la potencia es: " + alcuadrado(n1));
	    
	}
}
