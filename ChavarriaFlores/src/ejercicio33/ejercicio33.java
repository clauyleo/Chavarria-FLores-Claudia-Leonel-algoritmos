package ejercicio33;

import java.util.Scanner;     

public class ejercicio33 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		char nombre;
		int edad;

		for (int i = 1; i <= 11; i++) {
			System.out.println("Nombre del jugador: " + i);
			nombre = entrada.next().charAt(0);
			System.out.println("Edad del jugador: ");
			edad = entrada.next().charAt(0);
		}
}
}