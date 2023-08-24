package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int salario;
		
		
		for (int i = 1; i <=12; i++) {
			System.out.println("ingrese el salario de cada mes: "+i);
			salario= entrada.nextInt();
			 if (salario < 100000) {
			    	System.out.println("salario es menor $100000");
			    }
			 else if(salario >= 100000) {
			    	System.out.println("salario es mayor $100000");
			    }
					
					
					
		}		
	   


}		
}

