package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {

	static String nombre, nombre_min, apellido_may;
	static String apellido;
	static char inicial, inicial_ap;

	public static void ingresar_Apellido() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese un nombre: ");
		nombre = entrada.next();

		System.out.println("ingrese un apellido: ");
		apellido = entrada.next();
	}

	public static void apellido() {

		nombre_min = nombre.toLowerCase();

		apellido_may = apellido.toLowerCase();
		System.out.println(nombre_min + "\n" + apellido_may);

	}

	public static void inicial() {

		inicial = nombre.toUpperCase().charAt(0);
		inicial_ap = apellido.toUpperCase().charAt(0);

		System.out.println(inicial);
		System.out.println(inicial_ap);
	}
	
	public static void recorte() {
		String recorte= nombre_min.substring(1);
		String recorte_ap= apellido_may.substring(1);
		System.out.println(recorte);
		System.out.println(recorte_ap);
	}

	public static void main(String[] args) {
		ingresar_Apellido();
		apellido();
		inicial();
		recorte();

	}
}