package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contrase�a = 81106, intentos = 0;
		
		System.out.println("Ingresar contrase�a: ");
		contrase�a = entrada.nextInt();
				
				while (contrase�a != 81106 && intentos < 3) {
					
								
					System.out.println("No, le erraste.");
					intentos++;
					
					System.out.println("Contrase�a Incorrecta");
					System.out.println("Cantidad de intentos: " + intentos);
					System.out.println("\nVolver a intentarlo: ");
					contrase�a = entrada.nextInt();
					
					
				}
				
				if (contrase�a == 81106) {
				System.out.println("Contrase�a correcta.");
				}
				
				if(contrase�a != 81106) {
					System.out.println("Cuenta bloqueada");
				}
			
		

}
}
