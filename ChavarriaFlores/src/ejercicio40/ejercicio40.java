package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
		int[] temperatura = new int[11];
		int i;
		float promedio=0;
		
		for (i = 0; i <5; i++) {
                   System.out.println("la temperatura "+(i+1) +" es: ");
			
			temperatura[i] = entrada.nextInt();
			promedio+=temperatura[i]; // promedio = promedio + temperatura
			
		}
		
		for ( i = 0; i<5; i++) {
			
			System.out.println("la temperatura "+(i+1) +" es: ");
			System.out.println(temperatura[i]);
			
		}
		
		
		System.out.println("el promedio total es: "+ (promedio/5));
}
}