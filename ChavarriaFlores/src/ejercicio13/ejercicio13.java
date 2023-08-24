package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char talle;
		
		System.out.println(" indica el talle de tu remera S, M o L : ");
		talle = entrada.next().charAt(0);
		
		  if (talle =='s' ) {
			System.out.println("quedan 5 remeras disponibles");			
		  }
		   if (talle == 'm' ){
		    System.out.println("quedan 2 remeras disponibles ");	
		  }
		
		   if(talle =='l' ) {
			System.out.println("no quedan remeras disponibles  ");			
			  }
		
	}
}
