package ejercicio11;

import java.util.Scanner;

      public class ejercicio11{
	  public static void main(String[] args) {
      
      Scanner entrada = new Scanner(System.in);
      
      int numero;
      
      System.out.println("ingresa un numero: ");
	  numero = entrada.nextInt();
	  
	  
	  if (numero>0) {
			System.out.println("su numero es positivo");
		}
		
	  else if(numero==0) {
		  System.out.println("su numero es 0");
	  }
	  
	  else {
			System.out.println("su numero es negativo");  
		}
  }
}