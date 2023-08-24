package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner (System.in);
		
		int seguidores = 1;
		
		while (seguidores <=100) {
			System.out.println("Seguidor n°: "+seguidores);
			Thread.sleep(20);
			
			seguidores++;
				
		}

		System.out.println("Lograste llegar a 100 seguidores");
	}
}
