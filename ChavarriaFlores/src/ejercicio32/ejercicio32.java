package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
public static void main(String[] args)throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, limite = 20, resul;

		System.out.println("Indique de que numero desea ver su tabla de multiplicar ");
		num = entrada.nextInt();

		
		for (int i = 0; i <= limite; i++) {
			resul = num * i;
			System.out.println(num + " * " + i + " = " + resul);
		}

		
		
}
}