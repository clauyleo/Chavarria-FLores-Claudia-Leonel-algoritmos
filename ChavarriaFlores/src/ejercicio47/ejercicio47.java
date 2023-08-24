package ejercicio47;

import java.util.Scanner;

import java.util.Arrays;

public class ejercicio47 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de notas: ");
		int cantidadNotas = entrada.nextInt();
		entrada.nextLine();

		String[] apellidos = new String[cantidadNotas];
		int [] notas = new int[cantidadNotas];
		int [] copia_notas = new int[cantidadNotas];

		for (int i = 0; i < cantidadNotas; i++) {
			System.out.print("Ingrese el apellido del alumno: ");
			apellidos[i] = entrada.nextLine();

			System.out.print("Ingrese la nota del alumno: ");
			notas[i] = entrada.nextInt();
			entrada.nextLine();
		}

		Arrays.sort(copia_notas);

		System.out.println("Array desordenado: ");
		for (int i = 0; i < cantidadNotas; i++) {
			System.out.println(apellidos[i] + ": " + notas[i]);
		}

		System.out.println("Array ordenado: ");
		for (int i = 0; i < cantidadNotas; i++) {
			System.out.println(apellidos[i] + ": " + copia_notas[i]);
		}
	}
}