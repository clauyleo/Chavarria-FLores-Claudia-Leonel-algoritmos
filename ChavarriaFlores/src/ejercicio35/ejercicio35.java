package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota_max = 0, nota_min = 11, promedio=0;
		int nota, div;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese la nota n°: " + i);
			nota = entrada.nextInt();

			if (nota_max < nota) {
				nota_max=nota;
				System.out.println("la nota mas alta: " + nota_max);
			}
			
			
			if (nota_min > nota) {
				nota_min=nota;
				System.out.println("la nota mas baja: " + nota_min);
				
			}
			
			promedio+=nota;

		}

		promedio=promedio /5;
		System.out.println("el promedio es: "+promedio);
		
 
	}
}