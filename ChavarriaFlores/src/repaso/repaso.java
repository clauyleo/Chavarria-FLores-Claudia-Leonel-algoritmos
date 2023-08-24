package repaso;

import java.util.Scanner;

public class repaso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de Dni a anotar: ");

		int numero = entrada.nextInt();

		int[] Dni = new int[numero];
		
		int documento;

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
		int i;
		for (i = 0; i < Dni.length; i++) {
			System.out.print("lista ascendente: " + Dni[i] + "\n");
		}

		String[] apellidos = { "Martinez", "Miglio", "Rojas" };
		for (i = 0; i < Dni.length; i++) {

			System.out.print("los apellidos son: " + apellidos[i] + "\n");
			
		}
		for (i = 0; i <=5; i++) {
			System.out.print("ingrese un Dni " + "\n");
			documento=entrada.nextInt();
			
			if (documento == Dni[i]) {
				System.out.print("pertenece a: " + apellidos[i] + "\n");
				
				break;
			}
			
		}
	}
}

