package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int [4];
		
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Ingrese el valor " +(i)+": ");
			numero[i] = entrada.nextInt();
			
			if(numero[i]%2==0) {
				System.out.println("El numero es " + numero[i] );	
			}
		}
		
}
}
