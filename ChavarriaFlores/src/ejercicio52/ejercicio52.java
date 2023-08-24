package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[2][2];

		matriz[0][0] = -1;
		matriz[0][1] = 23;
		matriz[1][0] = 43;
		matriz[1][1] = 5;

		for (int i = 0; i < matriz.length; i++) { // posicion de las matrices
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] < 0) {
					System.out.println("Reemplazar valor negativo por: ");
					matriz[i][j] = entrada.nextInt();
				}

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();

		}

	}
}