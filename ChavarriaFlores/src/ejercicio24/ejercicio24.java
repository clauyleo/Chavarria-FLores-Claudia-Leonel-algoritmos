package ejercicio24;


import java.util.Scanner;

public class ejercicio24 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		char  decision = 'N';
		boolean quiero_salir = false; 
		
		
		
		System.out.println("puedo salir? ");
        decision = datos.next().charAt(0);
		
        while ( decision =='N' && quiero_salir  == false) {
        	
        	if (decision =='S') {
				quiero_salir = true;
				else if (decision == 'N') {
					System.out.println("Ingresa otro numero: ");
					edad = datos.nextInt();
				} else {
					System.out.println("Respuesta no valida. ");
					System.out.println("Ingresa otro numero: ");
					edad = datos.nextInt();
				}
			}
        	
	}   	
			
	}
