package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {
	
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  double num1, num2, resultado;
		  int num_salida;
		  
		  System.out.println("ingresa un numero: ");
		  num1 = entrada.nextDouble();
		  System.out.println("ingresa otro numero: ");
		  num2 = entrada.nextDouble();
		  
		  resultado = num1+num2;
		  System.out.println("tu resultado es: "+resultado);
		  
		  System.out.println("Ingresar el numero 0 para salir");
		  num_salida = entrada.nextInt();

		 
		  while (num_salida!=0) {
			  System.out.println("Ingresar otros dos numeros");
			  System.out.println("Ingresar el primer numero: ");
			  num1 = entrada.nextDouble();
			  System.out.println("ingresa el otro numero: ");
			  num2 = entrada.nextDouble();
			  resultado = num1+num2;
			  System.out.println("tu resultado es: "+resultado);

			  System.out.println("Ingresar el numero 0 para salir");
			  num_salida = entrada.nextInt();
		  }
		  
}
}