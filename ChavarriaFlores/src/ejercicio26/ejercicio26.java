package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contraseña = 81106, intentos = 0;
		
		System.out.println("Ingresar contraseña: ");
		contraseña = entrada.nextInt();
				
				while (contraseña != 81106 && intentos < 3) {
					
								
					System.out.println("No, le erraste.");
					intentos++;
					
					System.out.println("Contraseña Incorrecta");
					System.out.println("Cantidad de intentos: " + intentos);
					System.out.println("\nVolver a intentarlo: ");
					contraseña = entrada.nextInt();
					
					
				}
				
				if (contraseña == 81106) {
				System.out.println("Contraseña correcta.");
				}
				
				if(contraseña != 81106) {
					System.out.println("Cuenta bloqueada");
				}
			
		

}
}
