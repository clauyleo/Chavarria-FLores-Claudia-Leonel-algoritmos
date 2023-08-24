package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("cuantas personas van apostar: ");
		int cantidad = entrada.nextInt();

		int[] dinero = new int[cantidad];

		for (int l = 0; l < dinero.length; l++) {
			System.out.print("Ingrese un numero que quiera apostar: ");
			dinero[l] = entrada.nextInt();
		}

		int dineroMax = 0;
		int dineroMin = 1000000000;

		for (int m = 0; m < dinero.length; m++) {
			if (dinero[m] > dineroMax) {
				dineroMax = dinero[m];
			}
		}
		System.out.print("\nLa apuesta mayor es: " + dineroMax);

		for (int n = 0; n < dinero.length; n++) {
			if (dinero[n] < dineroMin) {
				dineroMin = dinero[n];
			}

		}
		System.out.print("\nLa puesta menor es: " + dineroMin);

		for (int i = 0; i < dinero.length; i++) {

			for (int j = 0; j < (dinero.length - i - 1); j++) {

				if (dinero[j] > dinero[j + 1]) {

					int temporal = dinero[j];

					dinero[j] = dinero[j + 1];

					dinero[j + 1] = temporal;
					
					
					if(dinero[j+i]<500) {
						System.out.print("Numero destacado");
					}
				}
			}
		}
		for (int i = 0; i < dinero.length; i++) {
			System.out.print("\nlista ascendente: " + dinero[i] + "\n");
		}
		
		
}
}