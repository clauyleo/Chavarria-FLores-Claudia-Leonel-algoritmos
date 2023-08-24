package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) throws InterruptedException {

		Scanner entrada = new Scanner(System.in);
		int[] numero = new int [5];
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Ingrese un numero:");
			numero[i] = entrada.nextInt();
			
			
			
			
			
			if (numero[i] < 0) {
				continue;
			} else {
				System.out.println("El valor de numero es: " + numero[i] );
				Thread.sleep(1000);
			}
		}

	}
}