package evaluacion;

import java.util.Scanner;

public class evaluacion {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int[] milanesa = new int[20];

		int hora_max = 15;
		int hora_min = 7;
		int milanesa_max = 0;
		int milanesa_min = 100000;
		float promedio = 0;

		for (int i = 8; i < 15; i += 2) {
			System.out.println("ingresar las milanesas a las:  " + i + "hs");
			milanesa[i] = entrada.nextInt();
			promedio += milanesa[i];
			if (milanesa_max < milanesa[i]) {
				milanesa_max = milanesa[i];
				
			}
			
			hora_max = i;
			if (milanesa[i] < milanesa_min) {
				milanesa_min = milanesa[i];
				hora_min = i;
			}
			
			
		}
		System.out.print("\nLa  cantidad de milanesa mayor es: " + milanesa_max);

		System.out.print("\nLa cantidad de milanesa menor es: " +  milanesa_min);

		for (int i = 0; i < milanesa.length; i++) {

			for (int j = 0; j < (milanesa.length - i - 1); j++) {

				if (milanesa[j] > milanesa[j + 1]) {

					int temporal = milanesa[j];

					milanesa[j] = milanesa[j + 1];

					milanesa[j + 1] = temporal;

				
						
					
				}
			}
		}

		for (int i = 0; i < milanesa.length; i++) {
			if (milanesa[i]>0) {
			System.out.print("\nlista ascendente: " + milanesa[i] + "\n");
			}
		}
		
		
		for (int i = 0; i < milanesa.length; i++) {
			if (milanesa[i]<20 && milanesa[i]!=0) {
			System.out.print("las milanesas menores a 20 son: " + milanesa[i] + "\n");
			}
		}
		
		
		
		System.out.println("el promedio total es: " + (promedio / 4));

	}
}
