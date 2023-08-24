package prueba;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] estudiantes = new int[5];
		int[] nota = new int[5];
		int nota_max = 0, nota_min = 999;
		String[] apellido = new String[5];
		String apellido_max = "";
		String apellido_min = "";
		int SumaNotas = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese el numero del legajo ");
			estudiantes[i] = entrada.nextInt();

			System.out.println("ingrese el apellido: ");
			apellido[i] = entrada.next();

		}

		for (int i = 0; i < estudiantes.length; i++) {

			for (int j = 0; j < (estudiantes.length - i - 1); j++) {

				if (estudiantes[j] > estudiantes[j + 1]) {

					int temporal = estudiantes[j];

					estudiantes[j] = estudiantes[j + 1];

					estudiantes[j + 1] = temporal;
				}
			}
		}

		System.out.println("Arreglo ordenado: ");
		for (int num : estudiantes) {
			System.out.println(num + "");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese la nota : ");
			nota[i] = entrada.nextInt();

			if (nota[i] > nota_max) {
				nota_max = nota[i];
				apellido_max = apellido[i];
			}
			if (nota[i] < nota_min) {
				nota_min = nota[i];
				apellido_min = apellido[i];
			}

			SumaNotas += nota[i];

		}

		System.out.println("la nota maxima : " + nota_max);
		System.out.println("le pertenece a: " + apellido_max);

		System.out.println("la nota minima es:  " + nota_min);
		System.out.println("le pertenece a: " + apellido_min);

		int promedio = SumaNotas / 5;

		System.out.println("promedio es: " + promedio);

	}

}
