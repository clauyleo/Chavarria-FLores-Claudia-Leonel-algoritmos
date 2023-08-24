package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float ganancia_min = 10000000, ganancia_max = 0, ganancia, ganancia_total=0;
		int i,hora_max=18,hora_min=7;																																																																																																																
		
		for (i = 8; i <= 17; i++) {
			System.out.println("ingresar la ganacia a las:  "+ i + "hs" );
			ganancia= entrada.nextInt();
			
			if (ganancia_max < ganancia) {
				ganancia_max=ganancia;
				
				hora_max=i;
				
			}
			
			
			if (ganancia_min > ganancia) {
				ganancia_min=ganancia;
				hora_min=i;
				
			}
			ganancia_total+=ganancia;
		}
		
		System.out.println("la ganacias mas alta" + ganancia_max+ "a las" + hora_max );
		System.out.println("la ganacia mas baja: " + ganancia_min+ "a las" + hora_min);
		System.out.println("La ganancia total es de: "+ganancia_total);
		
		
		
		}
		

	}

