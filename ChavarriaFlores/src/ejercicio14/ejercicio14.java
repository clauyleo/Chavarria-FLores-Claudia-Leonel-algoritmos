package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int numero;
			
			System.out.println("ingrese un numero");
			numero = entrada.nextInt();
			
			if (numero != 0) {
				System.out.println("se puede realizar la operacion");			
			  }
			
			else {
			    System.out.println("no se puede realizar ");	
			  }
			

			
		}


}
