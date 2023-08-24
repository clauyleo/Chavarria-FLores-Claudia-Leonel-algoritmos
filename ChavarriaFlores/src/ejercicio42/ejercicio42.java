package ejercicio42;

import java.util.Scanner;

public class ejercicio42 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		  int numero2, resultado;
		
		double numeroAleatorio = (Math.random()*5);
	
		
		int [] numero = new int[3];
		
		for (int  i = 0; i<3; i++) {
			System.out.println(" \n Ingresa un numero entre 0 y 50 ");
			System.out.println("Tu numero en el intento "+(i+1) +" es: ");
			numero[i] = entrada.nextInt();
			
		}
		
		
		 numero2 = entrada.nextInt();
		  resultado = entrada.nextInt();
		  
		if (numero2==resultado ) {
			System.out.println("ganaste");			
		  }
		  else {
		    System.out.println("perdiste");	
		  }
		  System.out.println("Su numero de Bingo es: "+resultado);

		

		for (int  i = 0; i<3; i++) {
			
			System.out.println("Tu numero en el intento "+(i+1) +" es: ");
			System.out.println(numero[i]);
			
		}                             
		 
	
}
}