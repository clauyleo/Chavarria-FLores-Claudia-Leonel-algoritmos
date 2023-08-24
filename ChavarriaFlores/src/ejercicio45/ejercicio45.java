package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean seEncontro = false;
		int socio2;
		char nombre2;
	
		int[] socio = new int[7];

		socio[0] = 1011;
		socio[1] = 2367;
		socio[2] = 8748;
		socio[3] = 9121;
		socio[4] = 817;
		socio[5] = 6423;
		socio[6] = 2034;
	
		String[] nombre = { "Enrique", "Liliana", "Lucas", "Juan","FIorella","Ariel","Daiana" };
		
		System.out.println("Para encontrar a un individuo, ingresar número de socio: ");
		 socio2 = entrada.nextInt();
		 
		for(int i = 0; i<7; i++){
				
			if (socio2 == socio[i]) {
				System.out.println("Este numero de socio le pertence a: "+ nombre[i]);
				System.out.println("Numero de socio: "+ socio2);
				System.out.println("Nombre del socio: "+ nombre[i]);
				 seEncontro = true;
				
			  }
			 				
		}
		
		if(seEncontro = false) {
			System.out.println("Numero inexistente");
		}
				
					 
		
	}
}