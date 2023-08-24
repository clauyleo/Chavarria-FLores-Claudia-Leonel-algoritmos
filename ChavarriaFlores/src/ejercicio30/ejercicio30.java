package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {
public static void main(String[] args)throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);

int seguidores = 1;
		
for (int i = 0; i <= 100; i++) {
	System.out.println("La cantidad de seguidores es: " + i);
	Thread.sleep(50);
}			
			seguidores++;
				
		

		System.out.println("Lograste llegar a 100 seguidores");
	}



}

