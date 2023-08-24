/*Armar una función que, por usuario o por programa,
 determine el máximo y mínimo de tres números ingresados.
Se debe mostrar por pantalla el valor máximo, 
y el valor mínimo de estos tres valores.*/

package ejercicio59;

import java.util.Scanner;

public class ejercicio59 {
	
	static int numero;
	static int num_min = 9999999 ;
     static int num_max = -999999;
     
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	     
	    for (int l = 0; l < 3; l++) {
	    
	    
	   System.out.println("Ingresa  numero: ");
	    numero =  entrada.nextInt();
	   
	    if (numero > num_max) {
	    	num_max = numero;
	    }
	    if (numero < num_min) {
	    	num_min = numero;
	    }
	    }
	}

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    
	    System.out.println("El numero minimo es: " + num_min);
		System.out.println("El numero maximo es: " + num_max);
	    
	   
	    
	}
}
 
	
	
	


