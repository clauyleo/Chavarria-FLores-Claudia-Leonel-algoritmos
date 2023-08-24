package ejercicio15;


import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		float numero2;
		
		System.out.println("Ingresa el costo total: ");
		numero = entrada.nextInt();
		
		
		if (numero>15000){
			numero2 = numero*0.10f;
			System.out.println("costo total con 10% de descuento: "+numero2);			
		  }
		
		else {
		    System.out.println("costo total");	
		  }
		
		
		
		
		
	
	}
}
