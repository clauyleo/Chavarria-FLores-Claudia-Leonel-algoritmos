package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
int contrase�a = 81106, intentos = 0;
boolean intento = false;
		
		System.out.println("Ingresar contrase�a: ");
		contrase�a = entrada.nextInt();
				
				while (contrase�a != 81106 && intentos < 3 && intento == false) {

					System.out.println("No, le erraste.");
					intentos++;
					
					System.out.println("Contrase�a Incorrecta");
					System.out.println("Cantidad de intentos: " + intentos);
					System.out.println("\nVolver a intentarlo: ");
					contrase�a = entrada.nextInt();
					
				
					
				}
				
				if (contrase�a == 81106) {
					intento = true;
					System.out.println("Contrase�a correcta.");
					}
					
					if(contrase�a != 81106) {
						System.out.println("Cuenta bloqueada");
					}
			
}
}
