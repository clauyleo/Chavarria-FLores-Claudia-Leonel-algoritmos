package ejercicio62;

import java.util.Scanner;

public class ejercicio62 {
	
	
	
	 static String apellido, apellidoMax = "", apellidoMin ="{";
	
	public static void ingresarApellido() {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("ingrese un apellido: ");
			apellido = entrada.next();
			
			if (apellido.compareTo(apellidoMax)>0) {
				apellidoMax = apellido;
							
			}
			
			if (apellido.compareTo(apellidoMin)<0) {
				apellidoMin = apellido;
				
				
			}
		}
		
		
	
		
		System.out.println("El mayor alfabeticamente es : " + apellidoMax);
		System.out.println("El menor alfabeticamente es : " + apellidoMin);
		
	}	
		public static void main(String[] args) {

			ingresarApellido();
		  
	}

}
