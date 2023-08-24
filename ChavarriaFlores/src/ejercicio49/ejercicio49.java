package ejercicio49;

import java.util.Scanner;

public class ejercicio49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de Dni a anotar: ");
		int cantidad = entrada.nextInt();

		int[] Dni = new int[cantidad];

		for (int i = 0; i < Dni.length; i++) {
		System.out.print("Ingresa un Dni: ");
		Dni[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < Dni.length; i++) {
			
			for (int j = 0; j < (Dni.length - i - 1); j++) {

				if (Dni[j] > Dni[j + 1]) {

					int temporal = Dni[j];

					Dni[j] = Dni[j + 1];

					Dni[j + 1] = temporal;

				}
			}
		}

		for (int i = 0; i < Dni.length; i++) {
			System.out.print("lista ascendente: " + Dni[i] + "\n");
		}
		for (int i = Dni.length - 1; i >= 0; i--) {
			System.out.print("lista descendente: " + Dni[i] + "\n");

		}
	}
}