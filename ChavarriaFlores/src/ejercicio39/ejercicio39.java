package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String [] nombre = new String[11];
		int[] edad = new int[11];
		int i;
		
		for (i = 0; i <11; i++) {

			System.out.println("Nombre del jugador "+(i+1) +": ");
			
			nombre[i]= entrada.next();
			
			System.out.println("Edad del jugador "+(i+1) +": ");
			
			edad[i] = entrada.nextInt();
			
		}
		
		for ( i = 0; i<11; i++) {
			
			System.out.println("Nombre del jugador "+(i+1) +": ");
			System.out.println(nombre[i]);
			
			System.out.println("Edad del jugador "+(i+1) +": ");
			System.out.println(edad[i]);
	
			}
		
		

}
}