package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contraseņa = 81106, intentos = 0;
		
		System.out.println("Ingresar contraseņa: ");
		contraseņa = entrada.nextInt();
				
				while (contraseņa != 81106 && intentos < 3) {
					
								
					System.out.println("No, le erraste.");
					intentos++;
					
					System.out.println("Contraseņa Incorrecta");
					System.out.println("Cantidad de intentos: " + intentos);
					System.out.println("\nVolver a intentarlo: ");
					contraseņa = entrada.nextInt();
					
					
				}
				
				if (contraseņa == 81106) {
				System.out.println("Contraseņa correcta.");
				}
				
				if(contraseņa != 81106) {
					System.out.println("Cuenta bloqueada");
				}
			
		

}
}
