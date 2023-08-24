package ejercicio38;

import java.util.Scanner;

public class ejercicio38 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		int i, hora_max= 20,  hora_min = 8, clientes_min = 200, clientes_max=0, clientes;
		
		for (i = 9; i <= 19; i+=2) {
			System.out.println("ingresar los clientes a las:  "+ i + "hs" );
			clientes= entrada.nextInt();
			if (clientes_max < clientes) {
				clientes_max=clientes;
				
				hora_max=i;
				
			}
			
			
			if (clientes_min > clientes) {
				clientes_min =clientes;
				hora_min=i;
			}
		}
		

	
		
		System.out.println("la cantidad de clientes mas alta es: " + clientes_max + "a las" + hora_max );
		System.out.println("la cantidad de clientes mas baja es: " + clientes_min + "a las" + hora_min);
		
		
}
}