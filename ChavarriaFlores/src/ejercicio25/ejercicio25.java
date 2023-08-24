package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	
		int numero2, intentos=0;
		boolean intento = false;

		double numero = (Math.random()*5);
		int resultado = (int) numero;
		  
		  System.out.println("Ingresar un numero: ");
		  numero2 = entrada.nextInt();

		  while ( numero2 != resultado && intento  == false) {
			  
			  System.out.println("No, le erraste.");
			  	intentos++;
				System.out.println("Cantidad de intentos: " + intentos);
				
				
				if (numero2 == resultado) {
					intento = true; 
				}
				 else if (numero2 != resultado) {
						System.out.println("Ingresa otro numero: ");
						numero2 = entrada.nextInt();
				} 
				
			
	}
	        
	        	
		  System.out.println("Ganaste ");
		 
		 
}
}