package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char talle;

		System.out.println(" indica el talle de tu remera S, M o L : ");
		talle = datos.next().charAt(0);

		switch (talle) {

		case 'S':
			System.out.println("quedan 5 remeras disponibles ");
			break;

		case 'M':
			System.out.println("quedan 2 remeras disponibles");
			break;

		case 'L':
			System.out.println("no quedan remeras disponibles ");
			break;

		default:
			System.out.println("No tengo ese talle disponible");
			break;
		}
		System.out.println("Hasta la proxima, que tenga un buen dia.");
	}
}